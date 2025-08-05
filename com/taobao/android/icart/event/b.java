package com.taobao.android.icart.event;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.bca;
import tb.bdx;
import tb.bem;
import tb.bga;
import tb.bmz;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_ADD_ADDRESS = 50101;
    public static final int REQUEST_CHANGE_ADDRESS = 50102;

    static {
        kge.a(-1212297142);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        JSONObject fields;
        Fragment u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        if (this.h == null || (fields = this.h.getFields()) == null || (u = this.f25791a.u()) == null) {
            return;
        }
        if (fields.getBoolean("noAddress").booleanValue()) {
            Nav.from(this.e).withFragment(u).forResult(50101).toUri("http://my.m.taobao.com/deliver/add_address.htm");
            return;
        }
        JSONObject c = c();
        if (c == null) {
            bga.a.b("iCart", "CartAddress", "CART_ADDRESS_01", "eventFields为空");
            return;
        }
        String string = c.getString("url");
        if (TextUtils.isEmpty(string)) {
            bga.a.b("iCart", "CartAddress", "CART_ADDRESS_02", "url为空");
            return;
        }
        String A = bem.A(this.b);
        if (TextUtils.isEmpty(A)) {
            A = c.getString("data");
        }
        if (TextUtils.isEmpty(A)) {
            bga.a.b("iCart", "CartAddress", "CART_ADDRESS_03", "data为空");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(com.taobao.android.address.wrapper.c.K_COMMON_ADDRESS_URL, string);
        bundle.putString("data", A);
        Nav.from(this.e).withFragment(u).withExtras(bundle).forResult(50102).toUri("https://my.m.taobao.com/deliver/transparent_address.htm");
    }
}
