package com.taobao.android.detail.mainpic.holder;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.util.List;
import tb.bny;
import tb.eur;
import tb.euw;

/* loaded from: classes4.dex */
public class g extends com.alibaba.android.ultron.vfw.viewholder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "mainpicBottomBar";
    public static String f = "bottomPadding";
    public com.taobao.android.detail.mainpic.g g;
    public com.alibaba.android.ultron.vfw.viewholder.j h;
    public bny i;
    public FrameLayout j;

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("c4a647c3", new Object[]{gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new g(bnyVar, com.taobao.android.detail.mainpic.g.this);
            }
        };
    }

    public g(bny bnyVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.i = bnyVar;
        this.g = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.h = this.i.v();
        this.j = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_pic_bottom_bar_layout, viewGroup, false);
        return this.j;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        com.alibaba.android.ultron.vfw.viewholder.h a2;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        List<IDMComponent> children = iDMComponent.getChildren();
        this.c = iDMComponent;
        if (children != null && children.size() > 0) {
            for (IDMComponent iDMComponent2 : children) {
                if (iDMComponent2 != null && (view = (a2 = this.h.a(this.j, this.h.a(iDMComponent2))).itemView) != null) {
                    this.h.a(a2, iDMComponent2);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    int i = -1;
                    try {
                        i = this.c.getFields().getInteger(f).intValue();
                    } catch (Exception e2) {
                        UnifyLog.d("MainPicBottomBarViewHolder", "bottomPaddingParseError: " + Log.getStackTraceString(e2));
                        euw.b(this.g, "bottomPaddingParseError", Log.getStackTraceString(e2));
                        e2.printStackTrace();
                    }
                    if (i >= 0) {
                        layoutParams.topMargin = (int) ((this.g.e().getResources().getDimension(R.dimen.main_pic_bottombar_height) - this.g.e().getResources().getDimension(R.dimen.main_pic_locator_height)) - eur.a(this.g.e(), i));
                        layoutParams.gravity = 1;
                    } else {
                        layoutParams.gravity = 17;
                    }
                    this.j.addView(view, layoutParams);
                }
            }
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            return;
        }
        try {
            String string = fields.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.j.setBackgroundColor(Color.parseColor(string));
        } catch (Exception e3) {
            UnifyLog.d("MainPicBottomBarViewHolder", "colorParseError: " + Log.getStackTraceString(e3));
            euw.b(this.g, "colorParseError", Log.getStackTraceString(e3));
            e3.printStackTrace();
        }
    }
}
