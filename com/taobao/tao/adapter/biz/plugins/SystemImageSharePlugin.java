package com.taobao.tao.adapter.biz.plugins;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.b;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.handler.worker.e;
import com.taobao.taobao.R;
import com.ut.share.utils.FlowOutFacade;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.acg;
import tb.kge;
import tb.obk;
import tb.oif;

/* loaded from: classes8.dex */
public class SystemImageSharePlugin implements obk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(-1166754799);
        kge.a(1377891874);
    }

    @Override // tb.obk.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Physical_Screenshots_SystemShare";
    }

    @Override // tb.obk.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.obk.a
    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c8f04a5", new Object[]{this, bVar})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(SystemImageSharePlugin systemImageSharePlugin, FragmentActivity fragmentActivity, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7dc50dc", new Object[]{systemImageSharePlugin, fragmentActivity, tBShareContent, str});
        } else {
            systemImageSharePlugin.a(fragmentActivity, tBShareContent, str);
        }
    }

    @Override // tb.obk.a
    public void onEvent(b bVar) {
        final FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b9073b", new Object[]{this, bVar});
            return;
        }
        final TBShareContent a2 = bVar.a().a();
        if (TextUtils.isEmpty(a2.imageUrl) || !new File(a2.imageUrl).exists() || (fragmentActivity = (FragmentActivity) ShareBizAdapter.getInstance().getAppEnv().c()) == null) {
            return;
        }
        new oif().a("screenshot", true, new e.a() { // from class: com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.handler.worker.e.a
            public void a(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context});
                }
            }

            @Override // com.taobao.tao.handler.worker.e.a
            public void b(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eca0fff", new Object[]{this, context});
                }
            }

            @Override // com.taobao.tao.handler.worker.e.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    SystemImageSharePlugin.a(SystemImageSharePlugin.this, fragmentActivity, a2, str);
                }
            }
        });
    }

    private void a(FragmentActivity fragmentActivity, final TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785009dc", new Object[]{this, fragmentActivity, tBShareContent, str});
        } else if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
        } else {
            Intent intent = new Intent();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (Build.VERSION.SDK_INT >= 24) {
                arrayList.add(a(fragmentActivity, str));
            } else {
                arrayList.add(Uri.fromFile(new File(str)));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareScreenImgUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareScreenToTimeLineUI"));
            arrayList2.add(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.AddFavoriteUI"));
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType("image/*");
            intent.addFlags(268435459);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            final long currentTimeMillis = System.currentTimeMillis();
            Fragment a2 = a(fragmentActivity.getSupportFragmentManager(), new a() { // from class: com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin.a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    String str2 = tBShareContent.businessId;
                    TBS.Ext.commitEvent("Page_Share", 19999, "PopupFinish", str2, null, "sysSharePanel=1,time=" + (System.currentTimeMillis() - currentTimeMillis) + ",data=" + jSONObject.toJSONString());
                }
            });
            Intent createChooser = Intent.createChooser(intent, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18159));
            createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) arrayList2.toArray(new ComponentName[0]));
            TBS.Ext.commitEvent("Page_Share", 19999, "Popup", tBShareContent.businessId, null, "sysSharePanel=1");
            try {
                FlowOutFacade.getInstance().startActivityForResult(a2, createChooser, 9999);
            } catch (Throwable unused) {
            }
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Toast makeText = Toast.makeText(acg.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18163), 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                }
            }, 600L);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static android.net.Uri a(android.content.Context r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "_id"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r11
            r0[r3] = r12
            java.lang.String r11 = "fcaa6b61"
            java.lang.Object r11 = r1.ipc$dispatch(r11, r0)
            android.net.Uri r11 = (android.net.Uri) r11
            return r11
        L1a:
            r1 = 0
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L85
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "_data=? "
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L85
            r9[r4] = r12     // Catch: java.lang.Throwable -> L85
            r10 = 0
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L61
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L61
            int r11 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L86
            int r11 = r2.getInt(r11)     // Catch: java.lang.Throwable -> L86
            java.lang.String r12 = "content://media/external/images/media"
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = ""
            r0.append(r3)     // Catch: java.lang.Throwable -> L86
            r0.append(r11)     // Catch: java.lang.Throwable -> L86
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L86
            android.net.Uri r11 = android.net.Uri.withAppendedPath(r12, r11)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.lang.Throwable -> L60
        L60:
            return r11
        L61:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "_data"
            r0.put(r3, r12)     // Catch: java.lang.Throwable -> L86
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L86
            android.net.Uri r12 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L86
            android.net.Uri r11 = r11.insert(r12, r0)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.lang.Throwable -> L7a
        L7a:
            return r11
        L7b:
            r11 = move-exception
            goto L7f
        L7d:
            r11 = move-exception
            r2 = r1
        L7f:
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.lang.Throwable -> L84
        L84:
            throw r11
        L85:
            r2 = r1
        L86:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.lang.Throwable -> L8b
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin.a(android.content.Context, java.lang.String):android.net.Uri");
    }

    private static Fragment a(FragmentManager fragmentManager, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("a71bc59c", new Object[]{fragmentManager, aVar});
        }
        ShareNavFragment shareNavFragment = (ShareNavFragment) fragmentManager.findFragmentByTag("SHARE_Hub_Fragment");
        if (shareNavFragment == null) {
            shareNavFragment = new ShareNavFragment();
        }
        if (!shareNavFragment.isAdded() && !fragmentManager.isDestroyed()) {
            fragmentManager.beginTransaction().add(shareNavFragment, "SHARE_Hub_Fragment").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        shareNavFragment.setNavCallback(aVar);
        return shareNavFragment;
    }

    /* loaded from: classes8.dex */
    public static class ShareNavFragment extends Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a mNavCallback;

        static {
            kge.a(-501258361);
        }

        public static /* synthetic */ Object ipc$super(ShareNavFragment shareNavFragment, String str, Object... objArr) {
            if (str.hashCode() == 1257714799) {
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            super.onActivityResult(i, i2, intent);
            if (i != 9999 || (aVar = this.mNavCallback) == null) {
                return;
            }
            aVar.a(intent == null ? new JSONObject() : new JSONObject(bundleToMap(intent.getExtras())));
        }

        public static Map<String, Object> bundleToMap(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5e7f0643", new Object[]{bundle});
            }
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    hashMap.put(str, bundle.get(str));
                }
            }
            return hashMap;
        }

        public void setNavCallback(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d2691c6", new Object[]{this, aVar});
            } else {
                this.mNavCallback = aVar;
            }
        }
    }
}
