package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.open.middletier.MidBridge;
import com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import tb.iao;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public class ExtContainerActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ActivityManager I;
    private boolean H;
    public long f;

    /* renamed from: a  reason: collision with root package name */
    public IBXWebview f4314a = null;
    public Handler b = null;
    public long c = 0;
    public String d = "";
    public String e = "?action=close";
    public String g = "";
    public String h = "";
    public String i = null;
    public String j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = true;
    public boolean o = false;
    public boolean p = false;
    public boolean q = true;
    public boolean r = false;
    public boolean s = true;
    public boolean t = true;
    public boolean u = false;
    public boolean v = false;
    public int w = 0;
    public float x = 1.0f;
    public int y = 0;
    public volatile int z = 0;
    public volatile int A = 0;
    public volatile int B = 0;
    public volatile int C = 0;
    private DownloadCompleteReceiver D = null;
    private long E = -1;
    private int F = 0;
    private String G = null;

    /* loaded from: classes3.dex */
    public class DownloadCompleteReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1354416778);
        }

        private DownloadCompleteReceiver() {
        }

        private File a(Context context, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("db07a929", new Object[]{this, context, new Long(j)});
            }
            File file = null;
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            if (j != -1) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(j);
                query.setFilterByStatus(8);
                Cursor query2 = downloadManager.query(query);
                if (query2 != null) {
                    if (query2.moveToFirst()) {
                        String string = query2.getString(query2.getColumnIndex("local_uri"));
                        if (!TextUtils.isEmpty(string)) {
                            file = new File(Uri.parse(string).getPath());
                        }
                    }
                    query2.close();
                }
            }
            return file;
        }

        public static /* synthetic */ Object ipc$super(DownloadCompleteReceiver downloadCompleteReceiver, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uri uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            if (intent != null) {
                try {
                    long longExtra = intent.getLongExtra("extra_download_id", -1L);
                    if (longExtra == ExtContainerActivity.c(ExtContainerActivity.this) && "android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                        if (ExtContainerActivity.this.r) {
                            ExtContainerActivity.this.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                        } else if (ExtContainerActivity.this.u) {
                            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
                            String mimeTypeForDownloadedFile = downloadManager.getMimeTypeForDownloadedFile(longExtra);
                            if (TextUtils.isEmpty(mimeTypeForDownloadedFile)) {
                                mimeTypeForDownloadedFile = "*/*";
                            }
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.addFlags(268435456);
                            if (Build.VERSION.SDK_INT < 23) {
                                uri = downloadManager.getUriForDownloadedFile(longExtra);
                            } else if (Build.VERSION.SDK_INT < 24) {
                                uri = Uri.fromFile(a(context, longExtra));
                            } else {
                                ExtContainerActivity.this.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                                uri = null;
                            }
                            if (uri != null) {
                                intent2.setDataAndType(uri, mimeTypeForDownloadedFile);
                                ExtContainerActivity.this.startActivity(intent2);
                            }
                        }
                    }
                } catch (Exception e) {
                    ExtContainerActivity.this.a(true, 2305, "", 0L, e.getMessage(), "");
                }
            }
            ExtContainerActivity extContainerActivity = ExtContainerActivity.this;
            boolean z = extContainerActivity.k;
            extContainerActivity.a(z, 0, "", 0L, iao.NEXT_TAG_RECEIVER, "" + ExtContainerActivity.c(ExtContainerActivity.this));
        }
    }

    /* loaded from: classes3.dex */
    public class DownloadSerice implements IBXWebview.IBXDownloadService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1442212627);
            kge.a(-371522019);
        }

        private DownloadSerice() {
        }

        @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview.IBXDownloadService
        public long startDownload(String str, String str2) {
            int i;
            ExtContainerActivity extContainerActivity;
            AlertDialog.Builder positiveButton;
            String absolutePath;
            ExtContainerActivity extContainerActivity2;
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("181c5f19", new Object[]{this, str, str2})).longValue();
            }
            try {
                Context applicationContext = ExtContainerActivity.this.getApplicationContext();
                ExtContainerActivity.this.i = str;
                ExtContainerActivity.this.j = str2;
                if (!ExtContainerActivity.a(ExtContainerActivity.this)) {
                    ExtContainerActivity.a(ExtContainerActivity.this, applicationContext.getApplicationInfo().targetSdkVersion);
                    if (ExtContainerActivity.b(ExtContainerActivity.this) < 33) {
                        extContainerActivity2 = ExtContainerActivity.this;
                        absolutePath = Environment.DIRECTORY_DOWNLOADS;
                    } else {
                        File externalCacheDir = applicationContext.getExternalCacheDir();
                        ExtContainerActivity extContainerActivity3 = ExtContainerActivity.this;
                        absolutePath = externalCacheDir.getAbsolutePath();
                        extContainerActivity2 = extContainerActivity3;
                    }
                    ExtContainerActivity.a(extContainerActivity2, absolutePath);
                }
                if (ExtContainerActivity.this.n) {
                    final HashMap<String, String> installedMarketPackageName = AppStoreUtils.getInstalledMarketPackageName(ExtContainerActivity.this);
                    i = installedMarketPackageName.size();
                    try {
                        if (installedMarketPackageName.size() > 1) {
                            final String[] strArr = new String[installedMarketPackageName.size()];
                            int i3 = 0;
                            for (String str3 : installedMarketPackageName.keySet()) {
                                strArr[i3] = str3;
                                i3++;
                            }
                            positiveButton = new AlertDialog.Builder(ExtContainerActivity.this).setTitle(R.string.sg_app_store_select).setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.DownloadSerice.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i4) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i4)});
                                        return;
                                    }
                                    ExtContainerActivity extContainerActivity4 = ExtContainerActivity.this;
                                    AppStoreUtils.toMarket(extContainerActivity4, ExtContainerActivity.getPackageNameWrapper(extContainerActivity4), (String) installedMarketPackageName.get(strArr[i4]));
                                }
                            });
                        } else if (installedMarketPackageName.size() == 1) {
                            AppStoreUtils.toMarket(ExtContainerActivity.this, ExtContainerActivity.getPackageNameWrapper(ExtContainerActivity.this), installedMarketPackageName.get(installedMarketPackageName.keySet().iterator().next()));
                        } else if (ExtContainerActivity.this.p) {
                            extContainerActivity = ExtContainerActivity.this;
                            i2 = ExtContainerActivity.a(extContainerActivity, str, str2);
                        } else {
                            positiveButton = new AlertDialog.Builder(ExtContainerActivity.this).setMessage(R.string.sg_app_store_not_exist).setPositiveButton(R.string.sg_dialog_ok, (DialogInterface.OnClickListener) null);
                        }
                        positiveButton.create().show();
                    } catch (Exception e) {
                        e = e;
                        ExtContainerActivity.this.a(true, 2304, "", 0L, e.getMessage(), "");
                        ExtContainerActivity extContainerActivity4 = ExtContainerActivity.this;
                        boolean z = extContainerActivity4.k;
                        extContainerActivity4.a(z, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i + "|" + i2 + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
                        return ExtContainerActivity.c(ExtContainerActivity.this);
                    }
                } else {
                    if (ExtContainerActivity.this.o) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.setData(Uri.parse(str));
                        ExtContainerActivity.this.startActivity(intent);
                    } else if (ExtContainerActivity.this.p) {
                        extContainerActivity = ExtContainerActivity.this;
                        i = 0;
                        i2 = ExtContainerActivity.a(extContainerActivity, str, str2);
                    }
                    i = 0;
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
            }
            ExtContainerActivity extContainerActivity42 = ExtContainerActivity.this;
            boolean z2 = extContainerActivity42.k;
            extContainerActivity42.a(z2, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i + "|" + i2 + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
            return ExtContainerActivity.c(ExtContainerActivity.this);
        }
    }

    static {
        kge.a(1592378346);
    }

    public ExtContainerActivity() {
        boolean z = false;
        this.H = MidBridge.getWvmlfcdmSwitch() > 0 ? true : z;
    }

    public static /* synthetic */ int a(ExtContainerActivity extContainerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13623869", new Object[]{extContainerActivity, new Integer(i)})).intValue();
        }
        extContainerActivity.F = i;
        return i;
    }

    public static /* synthetic */ int a(ExtContainerActivity extContainerActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9829a2b4", new Object[]{extContainerActivity, str, str2})).intValue() : extContainerActivity.a(str, str2);
    }

    private int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        if (((!this.H || Build.VERSION.SDK_INT >= 29) && (this.H || this.F >= 33)) || ContextCompat.checkSelfPermission(getApplication(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            b(str, str2);
            return 1;
        } else if (this.s) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1139);
            return 2;
        } else {
            new AlertDialog.Builder(this).setMessage(R.string.sg_permission_failed).setPositiveButton(R.string.sg_dialog_ok, (DialogInterface.OnClickListener) null).create().show();
            return 3;
        }
    }

    public static /* synthetic */ String a(ExtContainerActivity extContainerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b7700c9", new Object[]{extContainerActivity, str});
        }
        extContainerActivity.G = str;
        return str;
    }

    private String a(String str) throws MalformedURLException {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String query = new URL(str).getQuery();
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(query)) {
            sb.append(str);
            if (!str.endsWith("?")) {
                sb.append("?");
            }
            sb.append("tmd_nc=1");
            return sb.toString();
        }
        String str2 = null;
        for (String str3 : query.split("&")) {
            if (str3.startsWith("http_referer=")) {
                this.d = str3.substring(13);
                str2 = str3;
            } else if (!str3.equalsIgnoreCase("native=1")) {
                sb.append(str3);
                sb.append("&");
            }
        }
        sb.append("tmd_nc=1");
        if (str2 != null) {
            sb.append("&");
            sb.append(str2);
        }
        return str.replace(query, sb.toString());
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.v = true;
        if (isFinishing()) {
            return;
        }
        if (!isTaskRoot() || Build.VERSION.SDK_INT < 21) {
            finish();
        } else {
            finishAndRemoveTask();
        }
    }

    public static /* synthetic */ boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context);
    }

    public static /* synthetic */ boolean a(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19664031", new Object[]{extContainerActivity})).booleanValue() : extContainerActivity.H;
    }

    public static /* synthetic */ int b(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("208f2261", new Object[]{extContainerActivity})).intValue() : extContainerActivity.F;
    }

    private long b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b871", new Object[]{this, str, str2})).longValue();
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setVisibleInDownloadsUi(true);
        request.setAllowedOverRoaming(true);
        request.setAllowedNetworkTypes(2);
        request.setDestinationInExternalPublicDir(this.H ? Environment.DIRECTORY_DOWNLOADS : this.G, URLUtil.guessFileName(str, str2, getMIMEType(str)));
        DownloadManager downloadManager = (DownloadManager) getSystemService("download");
        if (this.q) {
            Toast.makeText(this, "开始下载更新包", 0).show();
        }
        long enqueue = downloadManager.enqueue(request);
        this.E = enqueue;
        return enqueue;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (isFinishing()) {
        } else {
            finish();
        }
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            if (I == null) {
                I = (ActivityManager) context.getSystemService("activity");
            }
            ActivityManager activityManager = I;
            if (activityManager != null) {
                String packageName = context.getPackageName();
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && runningTasks.size() > 0) {
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    if (!packageName.equals(componentName.getPackageName()) || !context.getPackageManager().getActivityInfo(componentName, 0).processName.equals(context.getApplicationInfo().processName)) {
                        return false;
                    }
                    if (!ExtContainerActivity.class.getName().equals(componentName.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static /* synthetic */ long c(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27b804a3", new Object[]{extContainerActivity})).longValue() : extContainerActivity.E;
    }

    public static /* synthetic */ void d(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0e6f0", new Object[]{extContainerActivity});
        } else {
            extContainerActivity.a();
        }
    }

    public static /* synthetic */ void e(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3609c931", new Object[]{extContainerActivity});
        } else {
            extContainerActivity.b();
        }
    }

    public static String getMIMEType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("261116cb", new Object[]{str});
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    public static String getPackageNameWrapper(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4c10f7", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(ExtContainerActivity extContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void a(int i, String str, String str2, String str3, boolean z, boolean z2, int i2) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b934beaa", new Object[]{this, new Integer(i), str, str2, str3, new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        if (z2) {
            j = currentTimeMillis;
            a(z2, 0, str, currentTimeMillis, str2, str3);
        } else {
            j = currentTimeMillis;
        }
        Intent intent = new Intent(IUIBridge.INTENT_SEND_LOG);
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra(IUIBridge.KEY_UI_LOG, "{mn:100155,ec:" + i + ",msg:" + str + ",tc:" + j + ",cp:" + str2 + ",ext:" + str3 + ",sid:" + this.c + ",bxuid:" + this.h + riy.BLOCK_END_STR);
        intent.putExtra(IUIBridge.KEY_UI_LOG_WAY, 6);
        intent.putExtra(IUIBridge.KEY_UI_LOG_SEND, z);
        intent.putExtra(IUIBridge.KEY_UI_INFO, i2 + "&" + this.h);
        intent.putExtra(IUIBridge.KEY_IS_SAMPLE, this.l);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void a(long j, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ba959d", new Object[]{this, new Long(j), str, new Integer(i)});
            return;
        }
        Intent intent = new Intent(str);
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra(IUIBridge.KEY_SESSION_ID, j);
        intent.putExtra(IUIBridge.KEY_UI_RESULT, i);
        intent.putExtra(IUIBridge.KEY_IS_SAMPLE, this.l);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void a(boolean z, int i, String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc6b57", new Object[]{this, new Boolean(z), new Integer(i), str, new Long(j), str2, str3});
        } else if (!z) {
        } else {
            String num = Integer.toString(100155);
            String str4 = this.g;
            UserTrackMethodJniBridge.addUtRecord(num, i, 7, str4, j, str, str2, str3, "" + this.c, this.h);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public void b(boolean z, int i, String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11adaf6", new Object[]{this, new Boolean(z), new Integer(i), str, new Long(j), str2, str3});
        } else if (!z) {
        } else {
            String num = Integer.toString(100169);
            String str4 = this.g;
            UserTrackMethodJniBridge.addUtRecord(num, i, 7, str4, j, str, str2, str3, "" + this.c, this.h);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.l && this.A == 0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && this.B == 0) {
                        this.B = 1;
                    }
                } else if (this.A == 0) {
                    this.A = 1;
                    a(0, "", "Dispatchtouchevent", "" + this.z + "" + this.B + "" + this.A, false, true, 21);
                }
            } else if (this.z == 0) {
                this.z = 1;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (this.m) {
        } else {
            super.onBackPressed();
            this.C = 4;
            a();
            a(this.c, IUIBridge.INTENT_ACTIVITY_RESULT, 4);
            a(0, "", "Onbackpressed", "" + this.m, false, this.k, 19);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:6|(1:8)|9|10|11|12|13|14|15|16|(15:18|(1:20)(1:46)|21|(1:23)(1:45)|24|(1:26)(1:44)|27|(1:29)(1:43)|30|(1:32)(1:42)|33|(1:35)(1:41)|36|(1:38)(1:40)|39)|47|(3:49|(1:51)(1:53)|52)|54|(5:55|56|57|58|59)|(14:61|(1:63)(1:93)|64|65|66|(8:68|(1:70)|73|74|75|76|77|(2:79|80)(2:81|(2:83|84)(1:85)))(1:92)|71|72|73|74|75|76|77|(0)(0))|94|(0)(0)|64|65|66|(0)(0)|71|72|73|74|75|76|77|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x022d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022e, code lost:
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0231, code lost:
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
        r16.k = true;
        a(com.alibaba.wireless.security.SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED, "" + r0.getMessage(), r14 + "|Exception", r5, false, r16.k, 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4 A[Catch: Exception -> 0x0230, TRY_ENTER, TryCatch #0 {Exception -> 0x0230, blocks: (B:56:0x0184, B:63:0x01a4, B:64:0x01a9, B:66:0x01b2, B:69:0x01c5, B:71:0x01c9, B:72:0x01dc, B:74:0x01f3, B:75:0x01f6, B:73:0x01df, B:65:0x01ac), top: B:94:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:56:0x0184, B:63:0x01a4, B:64:0x01a9, B:66:0x01b2, B:69:0x01c5, B:71:0x01c9, B:72:0x01dc, B:74:0x01f3, B:75:0x01f6, B:73:0x01df, B:65:0x01ac), top: B:94:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[Catch: Exception -> 0x0230, TRY_ENTER, TryCatch #0 {Exception -> 0x0230, blocks: (B:56:0x0184, B:63:0x01a4, B:64:0x01a9, B:66:0x01b2, B:69:0x01c5, B:71:0x01c9, B:72:0x01dc, B:74:0x01f3, B:75:0x01f6, B:73:0x01df, B:65:0x01ac), top: B:94:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:56:0x0184, B:63:0x01a4, B:64:0x01a9, B:66:0x01b2, B:69:0x01c5, B:71:0x01c9, B:72:0x01dc, B:74:0x01f3, B:75:0x01f6, B:73:0x01df, B:65:0x01ac), top: B:94:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0271  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r12
            java.lang.String r2 = "a6532022"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            r12.v = r3
            super.onDestroy()
            com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview r0 = r12.f4314a
            if (r0 == 0) goto L23
            r0.bxDestroy()     // Catch: java.lang.Exception -> L22
            r0 = 0
            r12.f4314a = r0     // Catch: java.lang.Exception -> L22
            goto L23
        L22:
        L23:
            boolean r0 = r12.H
            if (r0 == 0) goto L3a
            boolean r0 = r12.p
            if (r0 == 0) goto L4c
            boolean r0 = r12.t
            if (r0 == 0) goto L4c
            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity$DownloadCompleteReceiver r0 = r12.D     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4c
            android.app.Application r0 = r12.getApplication()     // Catch: java.lang.Exception -> L4b
        L37:
            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity$DownloadCompleteReceiver r1 = r12.D     // Catch: java.lang.Exception -> L4b
            goto L47
        L3a:
            boolean r0 = r12.t
            if (r0 != r3) goto L4c
            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity$DownloadCompleteReceiver r0 = r12.D     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4c
            android.app.Application r0 = r12.getApplication()     // Catch: java.lang.Exception -> L4b
            goto L37
        L47:
            r0.unregisterReceiver(r1)     // Catch: java.lang.Exception -> L4b
            goto L4c
        L4b:
        L4c:
            r5 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ondestroy"
            r0.append(r1)
            int r1 = r12.C
            r0.append(r1)
            java.lang.String r8 = r0.toString()
            int r0 = r12.C
            if (r0 != 0) goto L66
            r9 = 1
            goto L67
        L66:
            r9 = 0
        L67:
            r10 = 1
            r11 = 22
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r4 = r12
            r4.a(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.onDestroy():void");
    }

    @Override // android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        a(0, "", "onPause", "onPause", false, this.k, 14);
        if ((this.w & 1) == 1) {
            return;
        }
        this.b.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ExtContainerActivity extContainerActivity = ExtContainerActivity.this;
                if (extContainerActivity.v || !ExtContainerActivity.a((Context) extContainerActivity)) {
                    return;
                }
                ExtContainerActivity extContainerActivity2 = ExtContainerActivity.this;
                extContainerActivity2.C = 5;
                extContainerActivity2.a(extContainerActivity2.c, IUIBridge.INTENT_ACTIVITY_RESULT, 1);
                ExtContainerActivity.e(ExtContainerActivity.this);
                ExtContainerActivity extContainerActivity3 = ExtContainerActivity.this;
                extContainerActivity3.a(0, "", "onPause", "", false, extContainerActivity3.k, 20);
            }
        }, 1000L);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        int i2 = 3;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i != 1139) {
        } else {
            if (iArr.length > 0 && iArr[0] == 0) {
                b(this.i, this.j);
                i2 = 1;
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                new AlertDialog.Builder(this).setMessage("应用更新需要授予存储权限，请到设置中开启存储权限").setPositiveButton(ILocalizationService.CONFIRM, (DialogInterface.OnClickListener) null).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create().show();
                i2 = 2;
            } else {
                new AlertDialog.Builder(this).setMessage("应用更新需要授予存储权限，请到设置中开启存储权限").setPositiveButton(ILocalizationService.CONFIRM, (DialogInterface.OnClickListener) null).create().show();
            }
            boolean z = this.k;
            a(z, 0, "", 0L, "onRequestPermissionsResult", "" + i2);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        a(0, "", "onRestart", "onRestart", false, this.k, 25);
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (((this.w >> 1) & 1) != 1) {
            a(this.c, IUIBridge.INTENT_ACTIVITY_CREATE, 1);
        }
        a(0, "", "onResume", "onResume", false, this.k, 13);
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        a(0, "", "onStart", "onStart", false, this.k, 24);
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        a(0, "", MessageID.onStop, MessageID.onStop, false, this.k, 26);
    }
}
