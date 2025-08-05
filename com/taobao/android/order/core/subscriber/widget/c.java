package com.taobao.android.order.core.subscriber.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.hzy;
import tb.ibm;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f14636a;
    private PopupWindow b;
    private View c;
    private View.OnClickListener d;
    private LinearLayout e;
    private LinearLayout f;
    private int g;
    private float h;

    static {
        kge.a(1772241562);
    }

    public c(Context context, ArrayList<OperateFields> arrayList, View.OnClickListener onClickListener) {
        this.f14636a = context;
        this.d = onClickListener;
        c();
        a(arrayList);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g = ibm.b(this.f14636a);
        this.h = ibm.c(this.f14636a);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b.isShowing();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.dismiss();
        }
    }

    private void a(ArrayList<OperateFields> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else if (this.f14636a != null) {
            hzy.a("OperationPopWindow", "initByOrderList", arrayList.toString());
            this.c = LayoutInflater.from(this.f14636a).inflate(R.layout.order_popupwindow_core, (ViewGroup) null);
            this.e = (LinearLayout) this.c.findViewById(R.id.popwindow_layout_core);
            this.f = (LinearLayout) this.c.findViewById(R.id.popwindow_content_core);
            for (int i = 0; i < arrayList.size(); i++) {
                Button a2 = ibm.a(this.f14636a, arrayList.get(i), 0, this.d);
                a2.setBackgroundColor(0);
                a2.setAllCaps(false);
                a2.setTextColor(this.f14636a.getResources().getColor(R.color.order_b_e));
                float f = this.h;
                a2.setPadding((int) (f * 15.0f), (int) (f * 10.0f), (int) (15.0f * f), (int) (f * 10.0f));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a2.getLayoutParams();
                int dimensionPixelSize = this.f14636a.getResources().getDimensionPixelSize(R.dimen.order_batch_btn_h);
                int dimensionPixelSize2 = this.f14636a.getResources().getDimensionPixelSize(R.dimen.order_list_more_pop_width);
                layoutParams.width = -2;
                layoutParams.height = dimensionPixelSize;
                a2.setMinWidth(dimensionPixelSize2);
                a2.setGravity(19);
                this.f.addView(a2);
            }
            this.b = new PopupWindow(this.c, -2, -2, true);
            this.b.setTouchable(true);
            this.b.setOutsideTouchable(true);
            this.b.setBackgroundDrawable(new BitmapDrawable(this.f14636a.getResources(), (Bitmap) null));
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        Context context = this.f14636a;
        if (context == null) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        int[] iArr = new int[2];
        int dimensionPixelSize = this.f14636a.getResources().getDimensionPixelSize(R.dimen.operate_btn_height);
        int dimensionPixelSize2 = this.f14636a.getResources().getDimensionPixelSize(R.dimen.order_batch_btn_padding);
        view.getLocationOnScreen(iArr);
        if (this.g - iArr[1] > this.h * 120.0f) {
            this.e.setBackgroundResource(R.drawable.order_more_op_down_bg);
            LinearLayout linearLayout = this.e;
            float f = this.h;
            linearLayout.setPadding(((int) f) * 3, ((int) f) * 6, ((int) f) * 3, ((int) f) * 3);
            try {
                this.b.showAtLocation(view, 51, iArr[0] - (dimensionPixelSize2 * 2), iArr[1] + (dimensionPixelSize / 2));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.e.setBackgroundResource(R.drawable.order_more_op_up_bg);
        LinearLayout linearLayout2 = this.e;
        float f2 = this.h;
        linearLayout2.setPadding(((int) f2) * 3, 0, ((int) f2) * 3, ((int) f2) * 9);
        this.c.measure(-2, -2);
        try {
            this.b.showAtLocation(view, 83, 0, this.g - iArr[1]);
        } catch (Exception unused2) {
        }
    }
}
