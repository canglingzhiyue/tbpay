package com.taobao.avplayer;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class q implements com.taobao.avplayer.common.p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageStrategyConfig f16608a;
    private Activity b;

    static {
        kge.a(-1936481811);
        kge.a(-268765102);
    }

    public static /* synthetic */ ImageStrategyConfig a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("ce73ca7b", new Object[]{qVar}) : qVar.f16608a;
    }

    public q(Activity activity) {
        this.b = activity;
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWImageAdapter);
    }

    @Override // com.taobao.avplayer.common.p
    public void a(final String str, final ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84801d6c", new Object[]{this, str, imageView});
        } else {
            this.b.runOnUiThread(new Runnable() { // from class: com.taobao.avplayer.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ImageView imageView2 = imageView;
                    if (imageView2 == null) {
                        return;
                    }
                    com.taobao.phenix.intf.c cVar = null;
                    imageView2.setImageDrawable(null);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String a2 = q.this.a(imageView, str);
                    if (imageView.getTag() == null) {
                        cVar = com.taobao.phenix.intf.b.h().a(imageView.getContext()).a(a2).setImageStrategyInfo(q.a(q.this)).into(imageView);
                    } else if (imageView.getTag() instanceof com.taobao.phenix.intf.c) {
                        ((com.taobao.phenix.intf.c) imageView.getTag()).b();
                        com.taobao.phenix.intf.b.h().a(imageView.getContext()).a(a2).into(imageView);
                    }
                    imageView.setTag(cVar);
                }
            });
        }
    }

    @Override // com.taobao.avplayer.common.p
    public void a(final int i, final ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43208395", new Object[]{this, new Integer(i), imageView});
        } else {
            this.b.runOnUiThread(new Runnable() { // from class: com.taobao.avplayer.q.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (imageView == null || i <= 0) {
                    } else {
                        com.taobao.phenix.intf.b.h().a(com.taobao.phenix.request.d.a(i)).into(imageView);
                    }
                }
            });
        }
    }

    public String a(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8104eb4", new Object[]{this, imageView, str}) : (imageView == null || TextUtils.isEmpty(str)) ? str : b(imageView, str);
    }

    public String b(ImageView imageView, String str) {
        int height;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("423fd6d3", new Object[]{this, imageView, str});
        }
        this.f16608a = a();
        if (this.f16608a == null) {
            return str;
        }
        if (imageView.getLayoutParams() != null) {
            height = imageView.getLayoutParams().height;
            width = imageView.getLayoutParams().width;
        } else {
            height = imageView.getHeight();
            width = imageView.getWidth();
        }
        if (kck.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[DWImageAdapter] decideUrl---->url:");
            sb.append(str);
            sb.append("  width:");
            sb.append(width);
            sb.append("  height:");
            sb.append(height);
            com.taobao.taobaoavsdk.util.c.a(sb.substring(0));
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(width), Integer.valueOf(height), this.f16608a);
    }

    private ImageStrategyConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("95746ea1", new Object[]{this}) : ImageStrategyConfig.a(ImageStrategyConfig.WEAPP, 70).a(TaobaoImageUrlStrategy.ImageQuality.q75).a();
    }
}
