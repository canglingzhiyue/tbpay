package com.taobao.tao.shop.fetcher.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.fetcher.TBSRCacheData;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import tb.kge;
import tb.ous;
import tb.ouu;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21080a;

    static {
        kge.a(-959567685);
    }

    public a(Context context) {
        this.f21080a = context;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        SharedPreferences sharedPreferences = this.f21080a.getSharedPreferences("MODULE_TBSR", 0);
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString("TBSRCacheAdapter.K_CACHE_MD5", null);
        ouu.a("[TBSRCacheAdapter] : getCacheMD5=" + string);
        return string;
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("ceb859ab", new Object[]{this, str, new Long(j)}) : ous.a(this.f21080a).a(str, j);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            ous.a(this.f21080a).a();
        }
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData a(String str, String str2, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("b28197d1", new Object[]{this, str, str2, new Boolean(z), new Long(j)});
        }
        ouu.a("try to read cache, useRemoteCache: " + z + " local cache valid time is " + String.valueOf(j));
        return ous.a(this.f21080a).a(str, str2, z, j);
    }

    public boolean a(TBSRCacheData tBSRCacheData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc3aa7e9", new Object[]{this, tBSRCacheData, str})).booleanValue();
        }
        boolean a2 = ous.a(this.f21080a).a(tBSRCacheData);
        ouu.a("[TBSRCacheAdapter] : setCacheDO, DO=" + Boolean.toString(a2));
        if (a2) {
            a(str);
            ouu.a("[TBSRCacheAdapter] : setCacheDO,  md5=" + str);
        }
        return a2;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        SharedPreferences sharedPreferences = this.f21080a.getSharedPreferences("MODULE_TBSR", 0);
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("TBSRCacheAdapter.K_CACHE_MD5", str);
        edit.apply();
    }
}
