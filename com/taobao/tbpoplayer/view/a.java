package com.taobao.tbpoplayer.view;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f22263a = new ConcurrentHashMap();

    /* renamed from: com.taobao.tbpoplayer.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0920a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f22264a;

        static {
            kge.a(177478432);
            f22264a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("aa132478", new Object[0]) : f22264a;
        }
    }

    static {
        kge.a(-474174387);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("aa132478", new Object[0]) : C0920a.a();
    }

    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Map<String, String> map = this.f22263a.get(str);
        if (map == null) {
            map = new ConcurrentHashMap<>();
        }
        map.put(str2, str3);
        this.f22263a.put(str, map);
        return true;
    }

    public String b(String str, String str2, String str3) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.f22263a.get(str)) == null) {
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            return map.get(str2);
        }
        return map.get(str3);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f22263a.remove(str);
        }
    }
}
