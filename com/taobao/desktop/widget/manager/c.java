package com.taobao.desktop.widget.manager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kif;
import tb.kii;
import tb.nia;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f16976a;
    public final Map<Integer, Object> b = new HashMap();

    static {
        kge.a(-507386089);
    }

    public void a(RemoteViews remoteViews, Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f0f4cb", new Object[]{this, remoteViews, map});
            return;
        }
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (map.get(Integer.valueOf(intValue)) instanceof Bitmap) {
                remoteViews.setImageViewBitmap(intValue, (Bitmap) map.get(Integer.valueOf(intValue)));
            }
        }
    }

    public void a(RemoteViews remoteViews, int i, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fef7f85", new Object[]{this, remoteViews, new Integer(i), bitmap});
        } else if (bitmap == null) {
        } else {
            remoteViews.setImageViewBitmap(i, bitmap);
            a(remoteViews, i);
        }
    }

    public void a(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f30853", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (!StringUtils.isEmpty(str)) {
            a(remoteViews, i);
            remoteViews.setTextViewText(i, str);
        } else {
            b(remoteViews, i);
        }
    }

    public void b(RemoteViews remoteViews, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cba2b2", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                remoteViews.setTextColor(i, Color.parseColor(str));
            } catch (Exception e) {
                Class<?> cls = getClass();
                kif.a(cls, "parseColor error: " + e);
            }
        }
    }

    public void c(RemoteViews remoteViews, int i, String str) {
        PendingIntent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa43d11", new Object[]{this, remoteViews, new Integer(i), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setFlags(805339136);
            if (Build.VERSION.SDK_INT >= 31) {
                a2 = com.android.taobao.aop.a.a(this.f16976a, 0, intent, 201326592);
            } else {
                a2 = com.android.taobao.aop.a.a(this.f16976a, 0, intent, 134217728);
            }
            remoteViews.setOnClickPendingIntent(i, a2);
        }
    }

    public void a(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e929ec9", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 0);
        }
    }

    public void b(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb262e8", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 8);
        }
    }

    public void c(RemoteViews remoteViews, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d22707", new Object[]{this, remoteViews, new Integer(i)});
        } else {
            remoteViews.setViewVisibility(i, 4);
        }
    }

    public void a(final RemoteViews remoteViews, final int i, String str, nia niaVar, final List<Integer> list, final long j, final Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aca1b2f", new Object[]{this, remoteViews, new Integer(i), str, niaVar, list, new Long(j), map});
        } else if (niaVar == null) {
            com.taobao.phenix.intf.b.h().a(this.f16976a).a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.desktop.widget.manager.c.1
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
                    try {
                        map.put(Integer.valueOf(i), succPhenixEvent.getDrawable().getBitmap());
                        c.this.a(remoteViews, list, j, map);
                    } catch (Exception e) {
                        Class<?> cls = getClass();
                        kif.a(cls, "loadImage error: " + e);
                    }
                    return false;
                }
            }).fetch();
        } else {
            com.taobao.phenix.intf.b.h().a(this.f16976a).a(str).bitmapProcessors(niaVar).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.desktop.widget.manager.c.2
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
                    try {
                        map.put(Integer.valueOf(i), succPhenixEvent.getDrawable().getBitmap());
                        c.this.a(remoteViews, list, j, map);
                    } catch (Exception e) {
                        Class<?> cls = getClass();
                        kif.a(cls, "loadImage error: " + e);
                    }
                    return false;
                }
            }).fetch();
        }
    }

    public void a(RemoteViews remoteViews, List<Integer> list, long j, Map<Integer, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeeaac", new Object[]{this, remoteViews, list, new Long(j), map});
            return;
        }
        for (Integer num : map.keySet()) {
            if (map.get(Integer.valueOf(num.intValue())) instanceof String) {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        a(remoteViews, map);
        a(remoteViews, list, j);
        Class<?> cls = getClass();
        kif.a(cls, "hasLoad widgetId：" + list);
    }

    public Bitmap a(String str, String str2, String str3, boolean z) {
        float measureText;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f812b02c", new Object[]{this, str, str2, str3, new Boolean(z)});
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(str), Color.parseColor(str2)});
            gradientDrawable.setCornerRadius(kii.a(20.0f));
            Paint paint = new Paint();
            paint.setTextSize(kii.a(9.0f));
            if (z) {
                measureText = paint.measureText(str3);
                a2 = kii.a(22.0f);
            } else {
                measureText = paint.measureText(str3);
                a2 = kii.a(11.0f);
            }
            gradientDrawable.setSize((int) (measureText + a2), kii.a(14.0f));
            return a(gradientDrawable);
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "generateBitmapBg error：" + e.getMessage());
            return null;
        }
    }

    public Bitmap a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6a58e66a", new Object[]{this, drawable});
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    public void a(RemoteViews remoteViews, List<Integer> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592167b9", new Object[]{this, remoteViews, list, new Long(j)});
            return;
        }
        for (Integer num : list) {
            AppWidgetManager.getInstance(this.f16976a).updateAppWidget(num.intValue(), remoteViews);
        }
        g.a(this.f16976a).a(list, j);
    }
}
