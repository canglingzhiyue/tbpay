package com.taobao.homepage.dinamic3.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import tb.esr;
import tb.jqm;
import tb.kge;
import tb.onq;

/* loaded from: classes7.dex */
public class HStretchView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG;

    static {
        kge.a(1065637679);
    }

    public static /* synthetic */ Object ipc$super(HStretchView hStretchView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String access$000(HStretchView hStretchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc1134e9", new Object[]{hStretchView}) : hStretchView.TAG;
    }

    public static /* synthetic */ void access$100(HStretchView hStretchView, Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f0e1d6", new Object[]{hStretchView, bitmap, new Float(f), new Float(f2)});
        } else {
            hStretchView.loadBitmap(bitmap, f, f2);
        }
    }

    public HStretchView(Context context) {
        super(context);
        this.TAG = "StretchView";
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public HStretchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "StretchView";
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public HStretchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "StretchView";
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void setImageUrl(String str, final float f, final float f2, final BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d53c31c", new Object[]{this, str, new Float(f), new Float(f2), bitmapDrawable});
        } else if (!TextUtils.isEmpty(str)) {
            b.h().a(getContext()).a("homepage-ads", str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, onq.b(str, "5401")).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.homepage.dinamic3.view.HStretchView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null) {
                        HStretchView.access$100(HStretchView.this, succPhenixEvent.getDrawable().getBitmap(), f, f2);
                    }
                    return false;
                }
            }).failListener(new a<FailPhenixEvent>() { // from class: com.taobao.homepage.dinamic3.view.HStretchView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    BitmapDrawable bitmapDrawable2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    if (jqm.a()) {
                        e.b(HStretchView.access$000(HStretchView.this), "图片下载失败");
                    }
                    if (HStretchView.this.getDrawable() == null && (bitmapDrawable2 = bitmapDrawable) != null) {
                        HStretchView.access$100(HStretchView.this, bitmapDrawable2.getBitmap(), f, f2);
                        if (jqm.a()) {
                            e.b(HStretchView.access$000(HStretchView.this), "设置预置图片");
                        }
                    }
                    return false;
                }
            }).fetch();
        } else {
            setImageDrawable(null);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            b.h().a(getContext()).a("homepage-ads", str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, onq.b(str, "5401")).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.homepage.dinamic3.view.HStretchView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    BitmapDrawable drawable;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && (drawable = succPhenixEvent.getDrawable()) != null) {
                        drawable.setAntiAlias(false);
                        HStretchView.this.setImageBitmap(drawable.getBitmap());
                    }
                    return false;
                }
            }).failListener(new a<FailPhenixEvent>() { // from class: com.taobao.homepage.dinamic3.view.HStretchView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    if (jqm.a()) {
                        e.b(HStretchView.access$000(HStretchView.this), "图片下载失败");
                    }
                    return false;
                }
            }).fetch();
        } else {
            setImageDrawable(null);
        }
    }

    private void loadBitmap(Bitmap bitmap, float f, float f2) {
        Bitmap stretchBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10ec972", new Object[]{this, bitmap, new Float(f), new Float(f2)});
        } else if (bitmap == null || (stretchBitmap = getStretchBitmap(bitmap, f, f2)) == null) {
        } else {
            setImageBitmap(stretchBitmap);
        }
    }

    private Bitmap getStretchBitmap(Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4c43bd07", new Object[]{this, bitmap, new Float(f), new Float(f2)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0) {
            return bitmap;
        }
        if (jqm.a()) {
            e.b(this.TAG, String.format("bitmap width=%d, height=%d desRatio = %f", Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(f2)));
        }
        float f3 = height / width;
        if (f3 <= f2) {
            if (jqm.a()) {
                e.b(this.TAG, String.format("bitmapRatio = %f, desRatio =%f, bitmapRatio <= desRationo need stretch", Float.valueOf(f3), Float.valueOf(f2)));
            }
            return bitmap;
        } else if (f2 <= 0.0f) {
            if (jqm.a()) {
                e.b("desRatio cannot be less then 0", new String[0]);
            }
            return bitmap;
        } else if (f > 1.0f || f < 0.0f) {
            if (jqm.a()) {
                e.b("stretchPercentX can only be less then 1 and more then 0", new String[0]);
            }
            return bitmap;
        } else {
            int height2 = ((int) (bitmap.getHeight() / f2)) - bitmap.getWidth();
            int width2 = (int) (bitmap.getWidth() * f);
            if (jqm.a()) {
                e.b(this.TAG, String.format("stretchWidth = %d, stretchX = %d", Integer.valueOf(height2), Integer.valueOf(width2)));
            }
            if (width2 == bitmap.getWidth() && width2 > 0) {
                width2--;
            }
            return getStretchXBitmap(bitmap, width2, height2);
        }
    }

    private Bitmap getStretchXBitmap(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5ff1970d", new Object[]{this, bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i2, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Rect(0, 0, i, bitmap.getHeight()), new Rect(0, 0, i, bitmap.getHeight()), paint);
        int i3 = i + i2;
        canvas.drawBitmap(bitmap, new Rect(i, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i3, 0, bitmap.getWidth() + i2, bitmap.getHeight()), paint);
        canvas.drawBitmap(bitmap, new Rect(i, 0, i + 1, bitmap.getHeight()), new Rect(i, 0, i3, bitmap.getHeight()), paint);
        return createBitmap;
    }
}
