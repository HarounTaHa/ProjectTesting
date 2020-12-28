package com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.projecttestingforsmartdevice.R;
import com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.adapters.SearchRecyclerViewAdapter;
import com.example.projecttestingforsmartdevice.models.Product;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.List;

import static com.example.projecttestingforsmartdevice.mahmoudActivityBusinessLogic.home.HomeActivity.items;

public class SearchActivity extends AppCompatActivity implements SearchActivityViewInterface{

    MaterialSearchView materialSearchView;
    Toolbar toolbar;
    RecyclerView recyclerView;
    SearchRecyclerViewAdapter adapter;
    SearchActivityPresenter searchActivityPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        materialSearchView=findViewById(R.id.search_view);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        searchActivityPresenter=new SearchActivityPresenter(this);

        recyclerView= findViewById(R.id.recyclerView_search);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new SearchRecyclerViewAdapter(this, items);
        recyclerView.setAdapter(adapter);


        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchActivityPresenter.setQueryText(query,items);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchActivityPresenter.setQueryText(newText,items);
                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_item, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        materialSearchView.setMenuItem(item);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.ascending:
                Toast.makeText(getApplicationContext(),"ascending",Toast.LENGTH_LONG).show();
                searchActivityPresenter.setFilter("Ascending",items);
                return true;
            case R.id.descending:
                Toast.makeText(getApplicationContext(),"descending",Toast.LENGTH_LONG).show();
                searchActivityPresenter.setFilter("Descending",items);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (materialSearchView.isSearchOpen()) {
            materialSearchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void updateSearchList(List<Product> filteredList) {
        adapter.filterList(filteredList);
    }

    @Override
    public void updateFilterList(List<Product> filteredList) {
        adapter.filterList(filteredList);
    }
}