package com.taobao.taopai.material.bean;

import java.util.ArrayList;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialListBean implements IMTOPDataObject {
    private int currentPage = -1;
    private ArrayList<MaterialDetail> model;
    private int total;
    private int totalPage;

    static {
        kge.a(1975611026);
        kge.a(-350052935);
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }

    public ArrayList<MaterialDetail> getModel() {
        return this.model;
    }

    public void setModel(ArrayList<MaterialDetail> arrayList) {
        this.model = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MaterialListBean materialListBean = (MaterialListBean) obj;
            if (getCurrentPage() == materialListBean.getCurrentPage() && getTotal() == materialListBean.getTotal() && getTotalPage() == materialListBean.getTotalPage() && Objects.equals(getModel(), materialListBean.getModel())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getCurrentPage()), Integer.valueOf(getTotal()), Integer.valueOf(getTotalPage()), getModel());
    }
}
