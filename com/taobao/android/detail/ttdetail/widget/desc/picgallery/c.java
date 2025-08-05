package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.NetworkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;
    public ArrayList<String> d;
    public View f;
    public HashMap<String, String> h;
    public HashMap<String, String> i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public String n;
    public String o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11018a = false;
    public boolean b = false;
    public ArrayList<String> e = new ArrayList<>();
    public boolean g = NetworkUtils.a();

    static {
        kge.a(1520269102);
    }

    public void a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else {
            this.d = arrayList;
        }
    }
}
