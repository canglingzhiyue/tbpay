package com.taobao.android.editionswitcher;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import tb.kge;
import tb.noa;

/* loaded from: classes5.dex */
public class TBEditionPositionSwitcherWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1788378679);
    }

    public static /* synthetic */ Object ipc$super(TBEditionPositionSwitcherWVPlugin tBEditionPositionSwitcherWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean refreshPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16c7376", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        b.a(this.mContext);
        wVCallBackContext.success();
        return true;
    }

    private boolean getSelectedPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7304bf2c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo b = b.b(this.mContext);
        if (b != null) {
            r rVar = new r();
            rVar.a("msg", JSON.toJSONString(b));
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean getRealPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34c5e6f", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo c = b.c(this.mContext);
        if (c != null) {
            r rVar = new r();
            rVar.a("msg", JSON.toJSONString(c));
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean realPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2309779", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo c = b.c(this.mContext);
        if (c != null) {
            r rVar = new r();
            rVar.a("countryName", c.countryName);
            rVar.a(noa.KEY_CITY_NAME, c.cityName);
            rVar.a("countryNumCode", c.countryNumCode);
            rVar.a("countryCode", c.countryCode);
            rVar.a(noa.KEY_EDITION_CODE, c.editionCode);
            rVar.a("areaName", c.area);
            rVar.a("actualLanguageCode", c.actualLanguageCode);
            rVar.a("currencyCode", c.currencyCode);
            rVar.a("cityId", c.cityId);
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean selectedPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93b16336", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        PositionInfo b = b.b(this.mContext);
        if (b != null) {
            r rVar = new r();
            rVar.a("countryName", b.countryName);
            rVar.a(noa.KEY_CITY_NAME, b.cityName);
            rVar.a("countryNumCode", b.countryNumCode);
            rVar.a("countryCode", b.countryCode);
            rVar.a(noa.KEY_EDITION_CODE, b.editionCode);
            rVar.a("areaName", b.area);
            rVar.a("actualLanguageCode", b.actualLanguageCode);
            rVar.a("currencyCode", b.currencyCode);
            rVar.a("cityId", b.cityId);
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.success();
        }
        return true;
    }

    private boolean changeHtaoUserPosition(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc90ff10", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            PositionInfo positionInfo = (PositionInfo) JSON.parseObject(str, PositionInfo.class);
            if (positionInfo != null) {
                PositionInfo a2 = d.a(positionInfo.editionCode);
                a2.ext = positionInfo.ext;
                a2.ovsPopExt = positionInfo.ovsPopExt;
                b.a(this.mContext, a2);
                if (a2.ovsPopExt != null && 2 == a2.ovsPopExt.ovsRemindKind && b.a(a2.editionCode)) {
                    TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-areaauto-confirm", null, null, "area=" + b.c() + ",page_version=" + b.b(this.mContext).editionCode + ",option=" + a2.editionCode);
                    b.b(this.mContext, a2.editionCode);
                } else {
                    com.taobao.android.editionswitcher.homepage.c.a((Activity) this.mContext, 0);
                }
                wVCallBackContext.success();
            }
            return true;
        } catch (Exception e) {
            wVCallBackContext.error(e.toString());
            return false;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("refreshPosition".equals(str)) {
            return refreshPosition(str2, wVCallBackContext);
        }
        if ("getSelectedPosition".equals(str)) {
            return getSelectedPosition(str2, wVCallBackContext);
        }
        if ("getRealPosition".equals(str)) {
            return getRealPosition(str2, wVCallBackContext);
        }
        if ("realPosition".equals(str)) {
            return realPosition(str2, wVCallBackContext);
        }
        if ("selectedPosition".equals(str)) {
            return selectedPosition(str2, wVCallBackContext);
        }
        if ("changeHtaoUserPosition".equals(str)) {
            return changeHtaoUserPosition(str2, wVCallBackContext);
        }
        r rVar = new r();
        rVar.a("errorMsg", "no matched method");
        wVCallBackContext.error(rVar);
        return false;
    }
}
