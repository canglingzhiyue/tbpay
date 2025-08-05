package com.taobao.search.sf.datasource;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19439a;
    private JSONArray b;

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f19440a;

        static {
            kge.a(-1045652011);
            f19440a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("578e4a39", new Object[0]) : f19440a;
        }
    }

    static {
        kge.a(1504458939);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("578e4a39", new Object[0]) : a.a();
    }

    public void a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d6dd5a", new Object[]{this, str, jSONArray});
            return;
        }
        this.f19439a = str;
        this.b = jSONArray;
    }

    public JSONArray a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e47bc7cc", new Object[]{this, str});
        }
        if (!TextUtils.equals(str, this.f19439a)) {
            return null;
        }
        return this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f19439a = null;
        this.b = null;
    }
}
