package com.taobao.android.abilitykit.ability.pop.render.util;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1283157406);
    }

    public static void a(ViewGroup viewGroup, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d5a527", new Object[]{viewGroup, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (Build.VERSION.SDK_INT < 22) {
        } else {
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            if (i == 0 && f == f3 && f3 == f4) {
                final int i2 = (int) f;
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                        } else {
                            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i2);
                        }
                    }
                });
                viewGroup.setClipToOutline(true);
            } else if (i == 0 && f3 == 0.0f && f4 == 0.0f) {
                final int i3 = (int) f;
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.d.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(0, -i3, view.getWidth(), view.getHeight(), i3);
                        outline.offset(0, i3);
                    }
                });
                viewGroup.setClipToOutline(true);
            } else if (f3 == f4 && f == 0.0f && f2 == 0.0f) {
                final int i4 = (int) f3;
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.d.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        int width = view.getWidth();
                        int height = view.getHeight();
                        int i5 = i4;
                        outline.setRoundRect(0, 0, width, height + i5, i5);
                        outline.offset(0, -i4);
                    }
                });
                viewGroup.setClipToOutline(true);
            } else if (f == f3 && f2 == 0.0f && f4 == 0.0f) {
                final int i5 = (int) f;
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.d.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(-i5, 0, view.getWidth(), view.getHeight(), i5);
                        outline.offset(i5, 0);
                    }
                });
                viewGroup.setClipToOutline(true);
            } else if (f2 != f4 || f != 0.0f || f3 != 0.0f) {
            } else {
                final int i6 = (int) f2;
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.d.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(0, 0, view.getWidth() + i6, view.getHeight(), i6);
                        outline.offset(-i6, 0);
                    }
                });
                viewGroup.setClipToOutline(true);
            }
        }
    }
}
