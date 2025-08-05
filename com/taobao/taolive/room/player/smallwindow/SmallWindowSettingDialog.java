package com.taobao.taolive.room.player.smallwindow;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.sdk.permisson.a;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.h;
import tb.kge;

/* loaded from: classes8.dex */
public class SmallWindowSettingDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoliveQualityDialog";
    private Context mContext;
    private a mFrameContext;
    private Switch mSwitch;

    static {
        kge.a(1263788391);
    }

    public static /* synthetic */ Object ipc$super(SmallWindowSettingDialog smallWindowSettingDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else if (hashCode != 1639966335) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ void access$000(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88363", new Object[]{smallWindowSettingDialog});
        } else {
            smallWindowSettingDialog.checkHasPermission();
        }
    }

    public static /* synthetic */ Context access$100(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cc6669ba", new Object[]{smallWindowSettingDialog}) : smallWindowSettingDialog.mContext;
    }

    public static SmallWindowSettingDialog newInstance(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmallWindowSettingDialog) ipChange.ipc$dispatch("8d22b613", new Object[]{aVar});
        }
        SmallWindowSettingDialog smallWindowSettingDialog = new SmallWindowSettingDialog();
        smallWindowSettingDialog.setFrameContext(aVar);
        return smallWindowSettingDialog;
    }

    @Override // android.support.v4.app.DialogFragment
    /* renamed from: onCreateDialog */
    public Dialog mo1438onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        this.mContext = getContext();
        Dialog dialog = new Dialog(this.mContext, R.style.TL_BottomSheetDialog_SmallWindow);
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.taolive_small_window_setting, (ViewGroup) null, false);
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(true);
        initView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = b.a(this.mContext, 214.0f);
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.TL_BottomSheetDialog_Anim);
        }
        return dialog;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFrameContext(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17230f1a", new Object[]{this, aVar});
        } else {
            this.mFrameContext = aVar;
        }
    }

    private void initView(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mSwitch = (Switch) view.findViewById(R.id.taolive_window_setting_switch);
            Switch r5 = this.mSwitch;
            if (hasPermission() && ae.b("KEY_WINDOW_ZOOM_SWITCH", true)) {
                z = true;
            }
            r5.setChecked(z);
            this.mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.taolive.room.player.smallwindow.SmallWindowSettingDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z2)});
                        return;
                    }
                    ae.a("KEY_WINDOW_ZOOM_SWITCH", z2);
                    if (!z2) {
                        return;
                    }
                    SmallWindowSettingDialog.access$000(SmallWindowSettingDialog.this);
                }
            });
        }
    }

    private boolean hasPermission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9549414", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT < 24 || Settings.canDrawOverlays(this.mContext);
    }

    private void checkHasPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2caa9fe8", new Object[]{this});
        } else {
            h.a().a(new Runnable() { // from class: com.taobao.taolive.room.player.smallwindow.SmallWindowSettingDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (Build.VERSION.SDK_INT < 24 || Settings.canDrawOverlays(SmallWindowSettingDialog.access$100(SmallWindowSettingDialog.this))) {
                    } else {
                        com.taobao.taolive.sdk.permisson.a.b(SmallWindowSettingDialog.access$100(SmallWindowSettingDialog.this), new a.InterfaceC0910a() { // from class: com.taobao.taolive.room.player.smallwindow.SmallWindowSettingDialog.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                }
                            }

                            @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                            public void b() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("57a83e9", new Object[]{this});
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
