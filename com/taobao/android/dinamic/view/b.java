package com.taobao.android.dinamic.view;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f11773a;
    private DinamicTemplate b;
    private a c;
    private String d;
    private ArrayList<View> e;

    static {
        kge.a(910489849);
    }

    public b(String str) {
        this.d = str;
    }

    public DinamicTemplate a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicTemplate) ipChange.ipc$dispatch("8c5c7ab8", new Object[]{this}) : this.b;
    }

    public void a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc25672", new Object[]{this, dinamicTemplate});
        } else {
            this.b = dinamicTemplate;
        }
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3d59fcd0", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new a(this.d);
        }
        return this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        a aVar = this.c;
        return aVar == null || aVar.a();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        a aVar = this.c;
        return aVar == null || aVar.a();
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.f11773a;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f11773a = view;
        }
    }

    public ArrayList<View> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("3ffe8d47", new Object[]{this}) : this.e;
    }

    public void a(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else {
            this.e = arrayList;
        }
    }
}
