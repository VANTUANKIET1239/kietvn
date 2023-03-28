package com.example.doanbanhoa;

import java.util.ArrayList;
import java.util.List;

public class HoaData {
    public static ArrayList<Hoa> HoaDT = new ArrayList<>();
    public static ArrayList<Hoa> GeneratePhotoData(){
    return  (ArrayList<Hoa>) HoaDT;
    }
    public static Hoa GetImagebyId(int id){
        for (int i = 0; i < HoaDT.size(); i++){
            if(HoaDT.get(i).getID_Hoa() == id ){
                return HoaDT.get(i);
            }
        }
        return null;
    }

    public HoaData(ArrayList<Hoa> k) {
        this.HoaDT = k;
    }

    public static void AddHoa(Hoa k){
        HoaDT.add(k);
    }
    public static void AddRangeHoa(ArrayList<Hoa> k){
        for(int i =0; i < k.size(); i++){
            HoaDT.add(k.get(i));
        }
    }
    public static int GetCount(){
        return HoaDT.size();
    }
}
