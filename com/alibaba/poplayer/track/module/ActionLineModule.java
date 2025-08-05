package com.alibaba.poplayer.track.module;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class ActionLineModule implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public String f3200a;
    public String b;
    public int c;
    public boolean d;
    public String e;
    public List<ActionItem> f = new ArrayList();
    public List<ActionItem> g = new ArrayList();

    /* loaded from: classes3.dex */
    public static class ActionExecuteItem implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public String f3201a;
        public String b;

        static {
            kge.a(-2032382027);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes3.dex */
    public static class ActionItem implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public String f3202a;
        public List<ActionExecuteItem> b;
        public String c;
        public String d;

        static {
            kge.a(1415087142);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-96751833);
        kge.a(1028243835);
    }

    public ActionLineModule(String str, String str2, int i) {
        this.f3200a = str;
        this.b = str2;
        this.c = i;
    }
}
