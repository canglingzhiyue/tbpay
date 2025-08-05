package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* loaded from: classes7.dex */
public abstract class lfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public interface a {
        void a(Drawable drawable);
    }

    static {
        kge.a(1466648758);
    }

    public static void a(String str, Context context, final int i, final a aVar, lfw lfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7226036", new Object[]{str, context, new Integer(i), aVar, lfwVar});
        } else if (lfwVar != null) {
        } else {
            ldf.a("DrawableFactory", "DrawableFactory starts loading FILL-RESOLUTION image.");
            b.h().a(context).a(onq.a(str, (String) null), str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, onq.b(str, "5401")).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.lfw.1
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
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null && succPhenixEvent.getDrawable().getBitmap() != null && !succPhenixEvent.getDrawable().getBitmap().isRecycled() && i != -1) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        int i2 = i;
                        if (i2 != intrinsicHeight) {
                            intrinsicWidth = (i2 * intrinsicWidth) / intrinsicHeight;
                        }
                        drawable.setBounds(0, 0, intrinsicWidth, i);
                    }
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(drawable);
                    }
                    return false;
                }
            }).fetch();
        }
    }

    public static void a(String str, Context context, a aVar, lfw lfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17521df", new Object[]{str, context, aVar, lfwVar});
        } else {
            a(str, context, -1, aVar, lfwVar);
        }
    }
}
