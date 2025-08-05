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
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f14646a;
    private PopupWindow b;
    private View c;
    private View.OnClickListener d;
    private LinearLayout e;
    private LinearLayout f;
    private int g;
    private float h;

    static {
        kge.a(2087453943);
    }

    public g(Context context, ArrayList<OperateFields> arrayList, View.OnClickListener onClickListener) {
        this.f14646a = context;
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
        this.g = ibm.b(this.f14646a);
        this.h = ibm.c(this.f14646a);
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
        } else if (this.f14646a != null) {
            hzy.a("OperationPopWindow", "initByOrderList", arrayList.toString());
            this.c = LayoutInflater.from(this.f14646a).inflate(R.layout.order_popupwindow_core, (ViewGroup) null);
            this.e = (LinearLayout) this.c.findViewById(R.id.popwindow_layout_core);
            this.f = (LinearLayout) this.c.findViewById(R.id.popwindow_content_core);
            for (int i = 0; i < arrayList.size(); i++) {
                Button a2 = ibm.a(this.f14646a, arrayList.get(i), 0, this.d);
                a2.setBackgroundColor(0);
                a2.setAllCaps(false);
                a2.setTextColor(this.f14646a.getResources().getColor(R.color.order_b_e));
                float f = this.h;
                a2.setPadding((int) (f * 15.0f), (int) (f * 10.0f), (int) (15.0f * f), (int) (f * 10.0f));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a2.getLayoutParams();
                int dimensionPixelSize = this.f14646a.getResources().getDimensionPixelSize(R.dimen.order_batch_btn_h);
                int dimensionPixelSize2 = this.f14646a.getResources().getDimensionPixelSize(R.dimen.order_list_more_pop_width);
                layoutParams.width = -2;
                layoutParams.height = dimensionPixelSize;
                a2.setMinWidth(dimensionPixelSize2);
                a2.setGravity(19);
                this.f.addView(a2);
            }
            this.b = new PopupWindow(this.c, -2, -2, true);
            this.b.setTouchable(true);
            this.b.setOutsideTouchable(true);
            this.b.setBackgroundDrawable(new BitmapDrawable(this.f14646a.getResources(), (Bitmap) null));
        }
    }

    public void a(View view) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        Context context = this.f14646a;
        if (context == null) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = this.f14646a.getResources().getDisplayMetrics().heightPixels;
        int i2 = iArr[0];
        if (iArr[1] + view.getHeight() + this.b.getHeight() > i) {
            this.e.setBackgroundResource(R.drawable.bg_arrow_bottom);
            LinearLayout linearLayout = this.e;
            float f = this.h;
            linearLayout.setPadding(((int) f) * 3, 0, ((int) f) * 3, ((int) f) * 9);
            height = iArr[1] - this.b.getHeight();
        } else {
            this.e.setBackgroundResource(R.drawable.bg_arrow_top);
            LinearLayout linearLayout2 = this.e;
            float f2 = this.h;
            linearLayout2.setPadding(((int) f2) * 3, ((int) f2) * 3, ((int) f2) * 3, ((int) f2) * 3);
            height = iArr[1] + view.getHeight();
        }
        this.b.showAtLocation(view, 0, i2, height);
    }
}
