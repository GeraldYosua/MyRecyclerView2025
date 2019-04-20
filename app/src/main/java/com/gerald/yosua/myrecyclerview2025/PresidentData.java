package com.gerald.yosua.myrecyclerview2025;

import java.util.ArrayList;
import java.util.Collection;

public class PresidentData {
        public static String[][] data = new String[][]{
                {"Soekarno", "Presiden Pertama RI", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtVUz3uwUtf76I1jzapSiAStyX-sy61GUNUTGeG_4Js-Qy0bkE"},
                {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg"},
                {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg"},
                {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
                {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
                {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
                {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
        };

        public static Collection<? extends President> getListData(){
            President president = null;
            ArrayList<President> list = new ArrayList<>();
            for (String[] aData : data) {
                president = new President();
                president.setName(aData[0]);
                president.setRemarks(aData[1]);
                president.setPhoto(aData[2]);

                list.add(president);
            }

            return list;
        }
    }
