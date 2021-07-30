package com.example.hackapplication;



import java.util.List;

public interface IShopLoadListener {

    void onShopLoadSuccess(List<DoctorCat> shopModelList);
    void onShopLoadFailed(String message);
}
