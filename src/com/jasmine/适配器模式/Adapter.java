package com.jasmine.适配器模式;

public class Adapter implements CatAdapter,DogAdapter{
    private CatAdapter catAdapter;
    private DogAdapter dogAdapter;

    @Override
    public void catchM() {
        catAdapter.catchM();
    }

    @Override
    public void yeal() {
        dogAdapter.yeal();
    }

    public void setCatAdapter(CatAdapter catAdapter) {
        this.catAdapter = catAdapter;
    }

    public void setDogAdapter(DogAdapter dogAdapter) {
        this.dogAdapter = dogAdapter;
    }
}
