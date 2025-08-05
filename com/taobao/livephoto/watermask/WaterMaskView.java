package com.taobao.livephoto.watermask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import tb.kge;

/* loaded from: classes7.dex */
public class WaterMaskView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WaterMaskView";

    static {
        kge.a(-1369503968);
    }

    public WaterMaskView(Context context, Drawable drawable, String str) {
        super(context);
        initView(str, drawable);
    }

    private void initView(String str, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554d0ca", new Object[]{this, str, drawable});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) inflate(getContext(), R.layout.water_mask_view, this);
        ((ImageView) linearLayout.findViewById(R.id.water_mask_img)).setImageDrawable(drawable);
        ((TextView) linearLayout.findViewById(R.id.water_mask_text)).setText(str);
    }

    public static String saveBitmapAsFile(Context context, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63d21e2b", new Object[]{context, drawable, str});
        }
        WaterMaskView waterMaskView = new WaterMaskView(context, drawable, str);
        waterMaskView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        waterMaskView.layout(0, 0, waterMaskView.getMeasuredWidth(), waterMaskView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(waterMaskView.getMeasuredWidth(), waterMaskView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        waterMaskView.draw(new Canvas(createBitmap));
        try {
            String str2 = context.getFilesDir().getPath() + File.separator + System.currentTimeMillis() + ".jpg";
            a.a(createBitmap, str2);
            return str2;
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "saveBitmapToFile: ", e);
            return "";
        }
    }
}
