package com.taobao.oversea.homepage.common.tschedule;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_TYPE_PHA = "phaPreRender";

    /* renamed from: a  reason: collision with root package name */
    public static String f18649a = "init";
    public static String b = "editionChange";
    public static String c = "phaReady";
    public static String d = "pageChange";
    private static a i = new a();
    private Set<String> g = new HashSet();
    private String j;

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("202f36aa", new Object[0]) : i;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.j;
    }
}
