package com.example.tugasrecycleview;

import java.util.ArrayList;

public class SepatuData {
    public static String [][] data = new String[][]{
            {"NIKE Mercurial Superfly 360 Elite", "Rp.994.000", "https://c.static-nike.com/a/images/t_PDP_1280_v1/f_auto/j0zdc2ilgmgnifyljfk4/mercurial-superfly-360-elite-ag-pro-football-boot-C2P742.jpg"},
            {"NIKE Mercurial Vapor 360 Elite Neymar JR", "Rp.970.000", "https://c.static-nike.com/a/images/t_PDP_1280_v1/f_auto/mendcurnkqbnswh0mhvq/mercurial-vapor-360-elite-neymar-jr-firm-ground-soccer-cleat-3nTngN.jpg"},
            {"NIKE Hypervenom Phantom Elite DF FG", "Rp.1.550.257", "https://www.soccerpro.com/wp-content/uploads/aj3791_001_nike_hypervenom_phantom_elite_df_fg_y_01.jpg"},
            {"ADIDAS Predator 19.3 FG", "Rp.1.039.000", "https://media.sportaways.com/media/catalog/product/cache/1/small_image/235x235/9df78eab33525d08d6e5fb8d27136e95/a/d/adidas-predator_19_3_fg_brcyan-cblack_-1-min.jpg"},
            {"ADIDAS Copa 19.3 FG", "Rp.900.000", "https://media.sportaways.com/media/catalog/product/cache/1/small_image/235x235/9df78eab33525d08d6e5fb8d27136e95/a/d/adidas-copa_19_3_fg_syello-cblack_-1-min.jpg"},
            {"ADIDAS Nemeziz Messi 17+ 360 Agility FG", "Rp.2.240.041", "https://www.prodirectsoccer.com/productimages/V3_1_Main/156995.jpg?imwidth=768"},
    };

    public  static ArrayList<Sepatu> getListData(){
        ArrayList<Sepatu> list = new ArrayList<>();
        for (String[] aData : data){
            Sepatu sepatu = new Sepatu();
            sepatu.setName(aData[0]);
            sepatu.setPrice(aData[1]);
            sepatu.setPhoto(aData[2]);
            list.add(sepatu);
        }
        return list;
    }
}
