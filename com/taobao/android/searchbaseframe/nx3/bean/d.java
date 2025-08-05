package com.taobao.android.searchbaseframe.nx3.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import tb.iyx;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends com.taobao.android.searchbaseframe.datasource.impl.cell.a<WeexCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f14994a;
    private static String b;
    private c c = new c();

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 470578782) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseCellBean) objArr[1]), (BaseSearchResult) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "NxCellBean";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    static {
        kge.a(1693038109);
        f14994a = "degradeItemType";
        b = iyx.PARAM_VIDEO_AUTO_PLAY;
    }

    public WeexCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexCellBean) ipChange.ipc$dispatch("9ee450ff", new Object[]{this}) : new WeexCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, WeexCellBean weexCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1438dbbf", new Object[]{this, jSONObject, weexCellBean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) weexCellBean, baseSearchResult);
        WeexBean a2 = this.c.a();
        this.c.a(jSONObject, a2, (BaseSearchResult) null);
        weexCellBean.mWeexBean = a2;
        weexCellBean.degradeType = jSONObject.getString(f14994a);
        try {
            weexCellBean.videoPlayable = jSONObject.getBooleanValue(b);
            if (weexCellBean.videoPlayable) {
                return;
            }
            Object obj = jSONObject.get("info");
            if (!(obj instanceof JSONObject)) {
                return;
            }
            weexCellBean.videoPlayable = ((JSONObject) obj).getBooleanValue(b);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<WeexCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : WeexCellBean.class;
    }
}
