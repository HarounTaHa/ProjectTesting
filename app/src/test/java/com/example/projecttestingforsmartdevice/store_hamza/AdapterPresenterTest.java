//package com.example.store;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import java.util.ArrayList;
//
//@RunWith(MockitoJUnitRunner.class)
//public class AdapterPresenterTest {
//
//    AdapterPresenter adapterPresenter;
//
//    @Mock
//    AdapterViewInterface adapterView;
//
//    @Before
//    public void setup() throws Exception{
//        adapterPresenter = new AdapterPresenter(adapterView);
//    }
//
//    @Test
//    public void testIfPresenterUpdateCharLeftText(){
//
//        //given
//        Cart cart1 = new Cart(R.drawable.person, "Shirt", "Next", "$64.00", R.drawable.icon_plus, R.drawable.icon_minus, R.drawable.icon_delet);
//        Cart cart2 = new Cart(R.drawable.person, "Women t- shirt", "Lotto.LID", "$34.00", R.drawable.icon_plus, R.drawable.icon_minus, R.drawable.icon_delet);
//        Cart cart3 = new Cart(R.drawable.person, "Female t- shirt", "Bate", "$49.00", R.drawable.icon_plus, R.drawable.icon_minus, R.drawable.icon_delet);
//        ArrayList<Cart> carts = new ArrayList<>();
//        carts.add(cart1);
//        carts.add(cart2);
//        carts.add(cart3);
//
//        Cart cart4 = new Cart(R.drawable.person, "Shirt", "Next", "$64.00", R.drawable.icon_plus, R.drawable.icon_minus, R.drawable.icon_delet);
//        Cart cart5 = new Cart(R.drawable.person, "Women t- shirt", "Lotto.LID", "$34.00", R.drawable.icon_plus, R.drawable.icon_minus, R.drawable.icon_delet);
//        ArrayList<Cart> carts1 = new ArrayList<>();
//        carts1.add(cart4);
//        carts1.add(cart5);
//
//        //when
//        adapterPresenter.setRemoveCartList(2, carts);
//
//        //then
//        Mockito.verify(adapterView).updateCartList(carts1.size());
//
//    }
//
//}
