package com.jfinal.model.base;

import com.jfinal.plugin.activerecord.Model;

public class BaesModel<M extends BaesModel<M>> extends Model<M> {

    public boolean testBaseModel(){
        System.out.println("testing BaseModel...");
        return true;
    }
}
