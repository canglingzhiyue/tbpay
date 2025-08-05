package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TabHost;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.i;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.DialogAction;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.Theme;
import com.taobao.uikit.extend.component.unify.TBButtonType;
import com.taobao.uikit.extend.utils.TintHelper;
import com.ut.mini.UTAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public abstract class HostController implements TabHost.OnTabChangeListener, com.taobao.tao.navigation.c, com.taobao.tao.welcome.fragments.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APP_VIEW_MODE = "appViewMode";
    private static final String KEY_ASKED_BEFORE = "askedBefore";
    public static final String KEY_EXTRA_FULLY_NEW_INSTALL = "fullyNewInstall";
    private static final String KEY_PROVISION = "shouldcreateprovision";
    public static final String KEY_REQUEST_PERMISSION_ALWAYS = "requestPermissionAlways";
    private static final String KEY_TIP = "shouldCreateWelcomeTip";
    private static final String KEY_TRAFFIC = "shouldCreateTrafficPrompt";
    public static final String PAGE_NAME = "Page_Welcome";
    private static final int REQUEST_APP_PERMISSION = 200;
    private static final int REQUEST_APP_SETTINGS = 201;
    public static final String URI_HOMEPAGE = "http://m.taobao.com/index.htm";
    public static final String URI_MULTI_LANGUAGE = "http://m.taobao.com/i18nboarding.html";
    private static final AtomicBoolean sLaunched;
    private final AppCompatActivity host;

    /* loaded from: classes8.dex */
    interface a {
        Intent a(Intent intent);
    }

    public void alertProvision() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf766e0", new Object[]{this});
        }
    }

    public boolean handleIntent(Intent intent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6fb350f", new Object[]{this, intent, aVar})).booleanValue();
        }
        return false;
    }

    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        return false;
    }

    public abstract boolean isImmersive();

    public abstract void navigate();

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    public void onLocaleSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c7eb2", new Object[]{this});
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(HostController hostController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ec0b9", new Object[]{hostController});
        } else {
            hostController.afterTrafficPrompt();
        }
    }

    public static /* synthetic */ void access$100(HostController hostController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce64e58", new Object[]{hostController});
        } else {
            hostController.afterWelcomeTip();
        }
    }

    public HostController(AppCompatActivity appCompatActivity) {
        this.host = appCompatActivity;
    }

    static {
        kge.a(-1386276015);
        kge.a(1311616296);
        kge.a(1329579186);
        kge.a(-802272639);
        sLaunched = new AtomicBoolean(false);
    }

    public static HostController create(AppCompatActivity appCompatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HostController) ipChange.ipc$dispatch("1dd6a1fc", new Object[]{appCompatActivity});
        }
        if (!sLaunched.compareAndSet(false, true)) {
            return new AController(appCompatActivity);
        }
        return LauncherRuntime.m ? new AController(appCompatActivity) : new BController(appCompatActivity);
    }

    public static void enterViewMode(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d29579", new Object[]{activity});
            return;
        }
        Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putInt(KEY_APP_VIEW_MODE, 1).putBoolean(KEY_PROVISION, true).commit();
        Bundle bundle = new Bundle();
        bundle.putBoolean("viewMode", true);
        Intent flags = new Intent("android.intent.action.VIEW", Uri.parse("http://viewmode.m.taobao.com/index.htm")).setPackage(TaoHelper.getPackageName()).putExtra("url", "https://market.m.taobao.com/app/dinamic/h5-tb-home/index.html?isViewMode=true").putExtra("params", bundle).setFlags(67108864);
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(flags, 65536);
        if (resolveActivity != null) {
            flags.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
        }
        activity.startActivity(flags);
    }

    public static void exitViewMode(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d7363f", new Object[]{activity});
            return;
        }
        Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putInt(KEY_APP_VIEW_MODE, 0).putBoolean(KEY_PROVISION, false).commit();
        Bundle bundle = new Bundle();
        bundle.putBoolean("fullyNewInstall", true);
        Nav.from(activity).disableTransition().withExtras(bundle).withFlags(67108864).toUri("http://m.taobao.com/index.htm");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tao.welcome.HostController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    activity.finish();
                }
            }
        }, 1000L);
    }

    public boolean onPreCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f78a91", new Object[]{this, bundle})).booleanValue();
        }
        com.taobao.linkmanager.afc.utils.e.a(getIntent(), getHost().getClass().getName());
        return false;
    }

    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        printIntent(getIntent(), i.b.MEASURE_ONCREATE);
        checkPrerequisite();
    }

    public void printIntent(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455c67f7", new Object[]{this, intent, str});
        } else if (intent == null) {
        } else {
            try {
                Bundle extras = intent.getExtras();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                sb.append(intent.toString());
                sb.append(extras == null ? "null" : extras.toString());
                TLog.loge("Welcome", sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    public void checkPrerequisite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84b565", new Object[]{this});
        } else if (BuiltConfig.getBoolean(R.string.isAlertAvailableSizeDialog)) {
            alertAvailableSizeDialog();
        } else {
            alertTrafficPrompt();
        }
    }

    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}) : (T) this.host.findViewById(i);
    }

    public CharSequence getString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1b376365", new Object[]{this, new Integer(i)}) : this.host.getString(i);
    }

    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
        } else {
            this.host.setContentView(i);
        }
    }

    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            printIntent(intent, "onNewIntent");
        }
    }

    public void setIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f524bbe2", new Object[]{this, intent});
        } else {
            this.host.setIntent(intent);
        }
    }

    public void setTheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i)});
        } else {
            this.host.setTheme(i);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("d10c9ffc", new Object[]{this}) : this.host.getSupportFragmentManager();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0);
        if (!sharedPreferences.getBoolean(KEY_ASKED_BEFORE, false)) {
            sharedPreferences.edit().putBoolean(KEY_ASKED_BEFORE, true).commit();
        }
        if (i != 200) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            com.taobao.tao.welcome.fragments.a.a(getApplicationContext(), getHost().getClass().getName(), "拨打电话", "同意");
            navigate();
            return;
        }
        com.taobao.tao.welcome.fragments.a.a(getApplicationContext(), getHost().getClass().getName(), "拨打电话", "不同意");
        navigate();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 201) {
        } else {
            if (ActivityCompat.checkSelfPermission(getContext(), "android.permission.READ_PHONE_STATE") == 0) {
                navigate();
            } else {
                requestPermissionViaSettingScreen();
            }
        }
    }

    public void requestPermissionViaSettingScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd521d3", new Object[]{this});
        } else {
            new TBMaterialDialog.Builder(getContext()).positiveText(R.string.action_text_goto_setting).negativeText(R.string.action_text_refuse).theme(Theme.LIGHT).cancelable(false).customView(R.layout.permission_dialog2, false).onPositive(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                        return;
                    }
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + TaoHelper.getPackageName()));
                    intent.addCategory("android.intent.category.DEFAULT");
                    HostController.this.startActivityForResult(intent, 201);
                    tBMaterialDialog.dismiss();
                }
            }).onNegative(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                        return;
                    }
                    tBMaterialDialog.dismiss();
                    HostController.this.navigate();
                }
            }).show().show();
        }
    }

    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this}) : this.host.getApplicationContext();
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.host;
    }

    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this}) : this.host.getIntent();
    }

    public Activity getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("66876023", new Object[]{this}) : this.host;
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.host.finish();
        }
    }

    public void overridePendingTransition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6362f07", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.host.overridePendingTransition(i, i2);
        }
    }

    public Object getSystemService(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5c99a0f1", new Object[]{this, str}) : this.host.getSystemService(str);
    }

    public void startActivityForResult(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c9ecaa", new Object[]{this, intent, new Integer(i)});
        } else {
            this.host.startActivityForResult(intent, i);
        }
    }

    private void alertAvailableSizeDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef1d6dd", new Object[]{this});
        } else if (FileUtil.LOCAL_REPORT_FILE_MAX_SIZE >= TaoHelper.getSystemAvailableMemorySize()) {
            TBMaterialDialog build = new TBMaterialDialog.Builder(getContext()).content(R.string.wl_available_size_msg).cancelable(false).theme(Theme.LIGHT).positiveText(R.string.wl_AvailableSizeDialogBottonOK).onPositive(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                    } else {
                        HostController.this.finish();
                    }
                }
            }).build();
            build.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.tao.welcome.HostController.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                    }
                    return true;
                }
            });
            build.show();
        } else {
            alertTrafficPrompt();
        }
    }

    private void alertTrafficPrompt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16a0bcc", new Object[]{this});
        } else if (!shouldCreateTrafficPrompt(getContext())) {
            afterTrafficPrompt();
        } else {
            TBMaterialDialog build = new TBMaterialDialog.Builder(getContext()).cancelable(false).theme(Theme.LIGHT).positiveText(R.string.wl_Yes).positiveType(TBButtonType.NORMAL).negativeText(R.string.wl_No).negativeType(TBButtonType.SECONDARY).onNegative(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                    } else {
                        HostController.this.finish();
                    }
                }
            }).customView(R.layout.welcom_dialog, false).build();
            TextView textView = (TextView) build.findViewById(R.id.welcom_dialog_content);
            if (BuiltConfig.getBoolean(R.string.huawei_traffic_prompt)) {
                textView.setText(R.string.huawei_traffic_prompt_msg);
            } else {
                textView.setText(R.string.traffic_prompt_msg);
            }
            final CheckBox checkBox = (CheckBox) build.findViewById(R.id.welcom_dialog_checkbox);
            checkBox.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.welcome.HostController.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (checkBox.isChecked()) {
                        TintHelper.setTint(checkBox, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_btnNormal));
                    } else {
                        TintHelper.setTint(checkBox, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_mdContentColor));
                    }
                }
            });
            TBMaterialDialog.Builder builder = build.getBuilder();
            if (builder != null) {
                builder.onPositive(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                    public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                            return;
                        }
                        if (checkBox.isChecked()) {
                            SharedPreferences.Editor edit = HostController.this.getApplicationContext().getSharedPreferences(HostController.this.getHost().getLocalClassName(), 0).edit();
                            edit.putBoolean(HostController.KEY_TRAFFIC, false);
                            edit.apply();
                        }
                        HostController.access$000(HostController.this);
                    }
                }).onNegative(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                    public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                            return;
                        }
                        HostController.this.finish();
                        HostController.this.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                    }
                });
            }
            build.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.tao.welcome.HostController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                    }
                    return true;
                }
            });
            build.show();
        }
    }

    public static boolean shouldCreateTrafficPrompt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a934f3", new Object[]{context})).booleanValue();
        }
        if (!BuiltConfig.getBoolean(R.string.traffic_prompt)) {
            return false;
        }
        return context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(KEY_TRAFFIC, true);
    }

    private void afterTrafficPrompt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d851f4c", new Object[]{this});
        } else {
            alertWelcomeTip();
        }
    }

    private void alertWelcomeTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5be0e5c", new Object[]{this});
        } else if (!shouldCreateWelcomeTip(getApplicationContext())) {
            navigateInternal();
        } else {
            TBMaterialDialog build = new TBMaterialDialog.Builder(getContext()).cancelable(false).theme(Theme.LIGHT).positiveText(R.string.wl_Agree).positiveType(TBButtonType.NORMAL).negativeText(R.string.wl_Disagree).negativeType(TBButtonType.SECONDARY).onNegative(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                        return;
                    }
                    HostController.this.finish();
                    HostController.this.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
                }
            }).customView(R.layout.welcom_dialog, false).build();
            final CheckBox checkBox = (CheckBox) build.findViewById(R.id.welcom_dialog_checkbox);
            checkBox.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.welcome.HostController.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (checkBox.isChecked()) {
                        TintHelper.setTint(checkBox, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_btnNormal));
                    } else {
                        TintHelper.setTint(checkBox, ContextCompat.getColor(HostController.this.getContext(), R.color.uik_mdContentColor));
                    }
                }
            });
            ((TextView) build.findViewById(R.id.welcom_dialog_content)).setText(R.string.welcome_tip);
            TBMaterialDialog.Builder builder = build.getBuilder();
            if (builder != null) {
                builder.onPositive(new TBMaterialDialog.SingleButtonCallback() { // from class: com.taobao.tao.welcome.HostController.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
                    public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                            return;
                        }
                        if (checkBox.isChecked()) {
                            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit();
                            edit.putBoolean(HostController.KEY_TIP, false);
                            edit.apply();
                        }
                        HostController.access$100(HostController.this);
                    }
                });
            }
            build.show();
        }
    }

    public static boolean shouldCreateWelcomeTip(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e27725d", new Object[]{context})).booleanValue();
        }
        if (!BuiltConfig.getBoolean(R.string.isMotoDevice)) {
            return false;
        }
        return context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(KEY_TIP, true);
    }

    private void afterWelcomeTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c27aadc", new Object[]{this});
        } else {
            navigate();
        }
    }

    private boolean shouldCreateProvision() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfbe2a91", new Object[]{this})).booleanValue() : Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(KEY_PROVISION, true);
    }

    private boolean shouldEnterViewMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("629a1bf8", new Object[]{this})).booleanValue() : Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getInt(KEY_APP_VIEW_MODE, -1) == 1;
    }

    public void updateProvisionFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bfbd81f", new Object[]{this});
            return;
        }
        Globals.getApplication().getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putBoolean(KEY_PROVISION, false).commit();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getHost(), PAGE_NAME);
    }

    private void navigateInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afcdcd5", new Object[]{this});
        } else if (shouldEnterViewMode()) {
            enterViewMode(getHost());
            finish();
        } else if (shouldCreateProvision()) {
            alertProvision();
        } else {
            navigate();
        }
    }
}
