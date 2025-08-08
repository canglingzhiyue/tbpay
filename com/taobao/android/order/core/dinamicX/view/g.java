package com.taobao.android.order.core.dinamicX.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.i;
import tb.alz;
import tb.bxb;
import tb.ibl;
import tb.jpo;
import tb.jqg;
import tb.kge;
import tb.rhz;

/* loaded from: classes6.dex */
public class g extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DXTBPrefetchImageViewWidget";

    static {
        kge.a(2062524685);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (StringUtils.isEmpty(getImageUrl())) {
            super.onRenderView(context, view);
        } else {
            Drawable a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(alz.BizKeyOrderList, getImageUrl());
            if (a2 != null) {
                setPlaceHolder(a2);
                setLocalImageDrawable(a2);
                if (context instanceof rhz) {
                    ((rhz) context).C();
                } else if (context instanceof FragmentActivity) {
                    ISupportFragment a3 = i.a(((FragmentActivity) context).getSupportFragmentManager());
                    if (a3 instanceof rhz) {
                        ((rhz) a3).C();
                    }
                } else {
                    jqg.b(TAG, "context error");
                }
            }
            if (a2 == null) {
                z = false;
            }
            jpo.b(context).a("d4", "imagePrefetched", String.valueOf(z));
            if (StringUtils.equals("orderlist_001", getImageBiztype())) {
                bxb.a(bxb.a.b(OrderBizCode.orderList, "firstScreenImgCacheHitRatio").a(z).a(z ? "hit cache!" : "cache miss!").a(0.001f));
                jqg.b(TAG, z + " - olist img load，imgUrl: " + getImageUrl());
            }
            if (z && ibl.x()) {
                jqg.b(TAG, "skip phenix's render");
            } else {
                super.onRenderView(context, view);
            }
        }
    }
}
