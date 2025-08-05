package tb;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import java.util.Map;

/* loaded from: classes5.dex */
public class gmw extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTBUBBLEAPPEAR = 6087836042645083999L;

    static {
        kge.a(537101895);
    }

    public static /* synthetic */ Object ipc$super(gmw gmwVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        final View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Integer)) {
        } else {
            int intValue = ((Integer) objArr[0]).intValue();
            DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.a()).get(d.TAG_DINAMICX_VIEW_COMPONENT);
            if (dMComponent == null) {
                return;
            }
            try {
                final JSONObject jSONObject = dMComponent.getFields().getJSONArray("tabs").getJSONObject(intValue);
                if (jSONObject == null || (v = dXRuntimeContext.v()) == null) {
                    return;
                }
                int intValue2 = jSONObject.getIntValue("disappearSecond");
                if (intValue2 <= 0) {
                    intValue2 = 3;
                }
                v.postDelayed(new Runnable() { // from class: tb.gmw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (Build.VERSION.SDK_INT < 16 || v.hasTransientState() || v.getVisibility() != 0) {
                        } else {
                            v.animate().alpha(0.0f).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: tb.gmw.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(Animator animator) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationRepeat(Animator animator) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationStart(Animator animator) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                    } else {
                                        jSONObject.remove(ITemplateSyncService.LAYOUT_STYLE_BUBBLE);
                                    }
                                }
                            }).start();
                        }
                    }
                }, intValue2 * 1000);
            } catch (Exception unused) {
            }
        }
    }
}
