package com.taobao.search.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.shop.ShopSearchDoorActivity;
import com.taobao.search.sf.InshopResultActivity;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class SearchInShopRouteActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1153221221);
    }

    public static /* synthetic */ Object ipc$super(SearchInShopRouteActivity searchInShopRouteActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent.getData();
        try {
            str = intent.getStringExtra("gotoSearch");
        } catch (Exception unused) {
            str = "";
        }
        if (StringUtils.isEmpty(str) && data != null) {
            str = data.getQueryParameter("gotoSearch");
        }
        Intent intent2 = new Intent();
        intent2.setData(data);
        try {
            bundle2 = intent.getExtras();
        } catch (Exception unused2) {
            bundle2 = null;
        }
        if (bundle2 != null) {
            intent2.putExtras(bundle2);
        }
        if ("1".equals(str) || "true".equals(str)) {
            intent2.setClass(this, ShopSearchDoorActivity.class);
        } else {
            intent2.putExtra("m", noa.VALUE_MODULE_INSHOP);
            intent2.setClass(this, InshopResultActivity.class);
        }
        startActivity(intent2);
        finish();
    }
}
