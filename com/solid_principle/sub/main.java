package com.solid_principle.sub;
import packageDatabase.*;
import com.solid_principle.*;
public class main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        solid_principle_orient_sub ori_new = new solid_principle_orient_sub();
        ori_new.temperature_detector_with_va();
        ori_new.temperature_detector();
        solid_principle_lg_sub lg_obj = new solid_principle_lg_sub();
        lg_obj.temperature_sensor();
        database_lg db_lg=new database_lg();
        db_lg.features();
        database_orient db_ori=new database_orient();
        db_ori.features();

    }
}