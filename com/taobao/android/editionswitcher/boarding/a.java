package com.taobao.android.editionswitcher.boarding;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.support.v7.app.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.localization.constants.Location;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.nav.Nav;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ivm;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(96456603);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        final Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new Runnable() { // from class: com.taobao.android.editionswitcher.boarding.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final android.support.v7.app.b b = new b.a(currentActivity, R.style.OvsBlacklistDialog).b();
                View inflate = LayoutInflater.from(currentActivity).inflate(R.layout.ovs_ip_blacklist_dialog, (ViewGroup) null);
                inflate.findViewById(R.id.ovs_refresh_btn).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.boarding.a.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "i18nBlackIPPopShow");
                        com.alibaba.ability.localization.b.a(Language.SIMPLIFIED_CHINESE, com.alibaba.ability.localization.b.e());
                        b.dismiss();
                        Nav.from(currentActivity).withFlags(32768).toUri("https://m.taobao.com");
                    }
                });
                b.setCancelable(false);
                b.a(inflate);
                b.show();
                TBS.Ext.commitEvent("Page_LocalBoarding", 2201, "i18nBlackIPPopShow");
                AppMonitor.Alarm.commitSuccess("Page_LocalBoarding", "i18nBlackIPPopShow");
            }
        });
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
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.editionswitcher.boarding.a.2
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
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.editionswitcher.boarding.a.3
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
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.editionswitcher.boarding.a.4
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
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.editionswitcher.boarding.a.5
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
                viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.editionswitcher.boarding.a.6
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

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        final Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new Runnable() { // from class: com.taobao.android.editionswitcher.boarding.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LocaleModel.HomePopData homePopData = h.f12282a.homePops.get(str);
                if (homePopData == null) {
                    return;
                }
                try {
                    final android.support.v7.app.b b = new b.a(currentActivity, R.style.OvsBlacklistDialog).b();
                    RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(currentActivity).inflate(R.layout.ovs_i18n_guild_dialog, (ViewGroup) null);
                    a.a(relativeLayout, a.a(currentActivity, 16), a.a(currentActivity, 16), 0.0f, 0.0f);
                    ((TUrlImageView) relativeLayout.findViewById(R.id.header_img)).setImageUrl(homePopData.headerImg);
                    ((TextView) relativeLayout.findViewById(R.id.title)).setText(homePopData.title);
                    ((TextView) relativeLayout.findViewById(R.id.tx_choose_en)).setText(homePopData.foreignButtonTitle);
                    ((TextView) relativeLayout.findViewById(R.id.tx_choose_zh)).setText(homePopData.chineseButtonTitle);
                    relativeLayout.findViewById(R.id.btn_choose_en).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.boarding.a.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-multiLangPop", "", "", "site=" + str + ",lang=en_US");
                            com.alibaba.ability.localization.b.a(Language.ENGLISH, Location.cast2Enum(str));
                            b.dismiss();
                        }
                    });
                    relativeLayout.findViewById(R.id.btn_choose_zh).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.boarding.a.7.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-multiLangPop", "", "", "site=" + str + ",lang=zh_CN");
                            com.alibaba.ability.localization.b.a(Language.SIMPLIFIED_CHINESE, Location.cast2Enum(str));
                            b.dismiss();
                        }
                    });
                    relativeLayout.findViewById(R.id.close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.boarding.a.7.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-multiLangPop-close");
                            b.dismiss();
                        }
                    });
                    b.setCancelable(false);
                    b.a(relativeLayout);
                    b.show();
                    com.taobao.android.editionswitcher.homepage.c.a(ivm.f29332a, "0");
                    TBS.Ext.commitEvent("Page_Home", 2201, "htao_show-multiLangPop");
                    AppMonitor.Alarm.commitSuccess("Page_Home", "htao_show-multiLangPop");
                } catch (Exception e) {
                    TLog.loge("EditionSwitcher", "showI18nGuildDialog exception : " + e);
                    AppMonitor.Alarm.commitSuccess("Page_Home", "htao_show-multiLangPop");
                }
            }
        });
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (h.f12282a != null && h.f12282a.homePops != null) {
            return h.f12282a.homePops.containsKey(str);
        }
        return false;
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{context, new Integer(i)})).floatValue() : (context.getResources().getDisplayMetrics().density * i) + 0.5f;
    }
}
