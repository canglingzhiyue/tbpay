package com.taobao.android.searchbaseframe.nx3.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import tb.iyx;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.taobao.android.searchbaseframe.datasource.impl.cell.a<MuiseCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f14993a;
    private static String b;
    private a c = new a();

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
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
        kge.a(-456017863);
        f14993a = iyx.PARAM_VIDEO_AUTO_PLAY;
        b = "videoForcePlay";
    }

    public MuiseCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseCellBean) ipChange.ipc$dispatch("b8bd76df", new Object[]{this}) : new MuiseCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, MuiseCellBean muiseCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35cb2f99", new Object[]{this, jSONObject, muiseCellBean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) muiseCellBean, baseSearchResult);
        MuiseBean a2 = this.c.a();
        this.c.a(jSONObject, a2, (BaseSearchResult) null);
        muiseCellBean.mMuiseBean = a2;
        try {
            muiseCellBean.videoPlayable = jSONObject.getBooleanValue(f14993a);
            muiseCellBean.videoForcePlay = jSONObject.getBooleanValue(b);
            Object obj = jSONObject.get("info");
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (!muiseCellBean.videoPlayable) {
                    muiseCellBean.videoPlayable = jSONObject2.getBooleanValue(f14993a);
                    if (!muiseCellBean.videoForcePlay) {
                        muiseCellBean.videoForcePlay = jSONObject2.getBooleanValue(b);
                    }
                }
                muiseCellBean.ndPreview = jSONObject2.getBooleanValue("ndPreview");
                muiseCellBean.ndPreviewUrl = jSONObject2.getString("ndPreviewUrl");
            }
        } catch (Exception unused) {
        }
        if (muiseCellBean.id <= 0) {
            return;
        }
        MuiseCellBean.recordLongId(muiseCellBean.id, muiseCellBean);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<MuiseCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : MuiseCellBean.class;
    }
}
