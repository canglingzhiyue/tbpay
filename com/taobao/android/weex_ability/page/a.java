package com.taobao.android.weex_ability.page;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_ICON_TYPE = "icon only supports http(s) or base64";
    public static final String ERROR_NAVIGATION_ADAPTER = "navigation adapter is not set";
    public static final String RESULT_ERROR = "MUS_FAILED";

    /* renamed from: a  reason: collision with root package name */
    private String f15962a;
    private String b;
    private Map<String, Object> c;

    static {
        kge.a(-399017280);
    }

    public a(String str, String str2) {
        this.f15962a = str;
        this.b = str2;
    }

    public a() {
        this(RESULT_ERROR, "");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f15962a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
    }
}
