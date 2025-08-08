package com.taobao.android.order.bundle.ultron.view;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import tb.bny;
import tb.hyo;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.alibaba.android.ultron.vfw.viewholder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e CREATOR;
    private View e;

    public b(bny bnyVar) {
        super(bnyVar);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.e = LayoutInflater.from(this.f2738a.k()).inflate(R.layout.babel_order_bundle_line_layout, viewGroup, false);
        return this.e;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        JSONObject c;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (this.f2738a == null || this.f2738a.d() == null || this.f2738a.d().a() == null || (c = this.f2738a.d().a().c()) == null || (jSONObject = c.getJSONObject("css")) == null) {
        } else {
            try {
                String string = jSONObject.getString("backGroundColor");
                String string2 = jSONObject.getString("cardGroupHeight");
                if (!StringUtils.isEmpty(string2)) {
                    this.e.getLayoutParams().height = hyo.a(this.e.getContext(), Integer.parseInt(string2));
                }
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                this.e.setBackgroundColor(Color.parseColor(string));
            } catch (Throwable unused) {
            }
        }
    }

    static {
        kge.a(483495547);
        CREATOR = new e() { // from class: com.taobao.android.order.bundle.ultron.view.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new b(bnyVar);
            }
        };
    }
}
