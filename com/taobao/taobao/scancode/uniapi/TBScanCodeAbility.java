package com.taobao.taobao.scancode.uniapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsScanCodeAbility;
import com.taobao.android.abilityidl.ability.ScanCodeResult;
import com.taobao.android.abilityidl.ability.ScanCodeSuccessResult;
import com.taobao.android.abilityidl.ability.cm;
import com.taobao.android.abilityidl.ability.dy;
import com.taobao.android.nav.Nav;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.scancode.common.util.a;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import tb.als;
import tb.kge;

/* loaded from: classes8.dex */
public class TBScanCodeAbility extends AbsScanCodeAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IS_NATIVE_ALBUM_SHOW = "isNativeAlbumShow";
    public static final String KEY_SCAN_ONLY = "scanOnly";
    private static final String SCANCODE_GATEWAY_URL = "https://m.taobao.com/scan_imagesearch";
    private static final String TAG = "TBScanCodeAbility";
    private Context mAppContext;
    private HashSet<BroadcastReceiver> mReceiverSet = new HashSet<>();

    static {
        kge.a(1108784868);
    }

    public static /* synthetic */ Object ipc$super(TBScanCodeAbility tBScanCodeAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ HashSet access$000(TBScanCodeAbility tBScanCodeAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("5215fe63", new Object[]{tBScanCodeAbility}) : tBScanCodeAbility.mReceiverSet;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScanCodeAbility
    public void scan(als alsVar, dy dyVar, final cm cmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a195497", new Object[]{this, alsVar, dyVar, cmVar});
            return;
        }
        String str = dyVar.f8830a;
        final String str2 = dyVar.b;
        String str3 = "scan called: pssource=" + str + ", type=" + str2;
        if (TextUtils.isEmpty(str)) {
            cmVar.a(new ErrorResult("params invalid"));
            return;
        }
        if (this.mAppContext == null) {
            this.mAppContext = Globals.getApplication();
        }
        jumpToScanPage(this.mAppContext, new a.InterfaceC0570a() { // from class: com.taobao.taobao.scancode.uniapi.TBScanCodeAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.scancode.common.util.a.InterfaceC0570a
            public void a(ScancodeResult scancodeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cacfb6b2", new Object[]{this, scancodeResult});
                    return;
                }
                String str4 = "process: result=" + scancodeResult.code + ", type=" + scancodeResult.type;
                ScanCodeSuccessResult scanCodeSuccessResult = new ScanCodeSuccessResult();
                scanCodeSuccessResult.results = new ArrayList();
                ScanCodeResult scanCodeResult = new ScanCodeResult();
                scanCodeResult.code = scancodeResult.code;
                scanCodeResult.type = str2;
                scanCodeSuccessResult.results.add(scanCodeResult);
                cmVar.a(scanCodeSuccessResult);
            }
        }, str);
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Iterator<BroadcastReceiver> it = this.mReceiverSet.iterator();
        while (it.hasNext()) {
            BroadcastReceiver next = it.next();
            Context context = this.mAppContext;
            if (context != null) {
                context.unregisterReceiver(next);
            }
        }
        this.mReceiverSet.clear();
    }

    private void jumpToScanPage(Context context, a.InterfaceC0570a interfaceC0570a, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a408f5c", new Object[]{this, context, interfaceC0570a, str});
            return;
        }
        String addCallbackReceiver = addCallbackReceiver(context, interfaceC0570a);
        Bundle bundle = new Bundle();
        bundle.putString(a.GATEWAY_CALLBACK_ACTION_PARAM, addCallbackReceiver);
        Uri.Builder buildUpon = Uri.parse(SCANCODE_GATEWAY_URL).buildUpon();
        buildUpon.appendQueryParameter("fromScan", "true");
        buildUpon.appendQueryParameter("scanOnly", "true");
        buildUpon.appendQueryParameter("pssource", str);
        buildUpon.appendQueryParameter("_pssource", str);
        String uri = buildUpon.build().toString();
        String str2 = "url=" + uri;
        Nav.from(context).withExtras(bundle).toUri(uri);
    }

    private HashSet<ScancodeType> getExpectScanTypeList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("c7960cf2", new Object[]{this, str});
        }
        HashSet<ScancodeType> hashSet = new HashSet<>();
        if (!TextUtils.isEmpty(str)) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1898203250) {
                if (hashCode == 384398432 && str.equals("BARCODE")) {
                    c = 1;
                }
            } else if (str.equals("QRCODE")) {
                c = 0;
            }
            if (c == 0) {
                hashSet.add(ScancodeType.QR);
            } else if (c == 1) {
                hashSet.add(ScancodeType.MEDICINE);
                hashSet.add(ScancodeType.PRODUCT);
                hashSet.add(ScancodeType.EXPRESS);
            } else {
                initDefaultScanTypeSet(hashSet);
            }
        } else {
            initDefaultScanTypeSet(hashSet);
        }
        String str2 = "type=" + str;
        Iterator<ScancodeType> it = hashSet.iterator();
        while (it.hasNext()) {
            String str3 = "scancodeType=" + it.next();
        }
        return hashSet;
    }

    private void initDefaultScanTypeSet(HashSet<ScancodeType> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e40d20c", new Object[]{this, hashSet});
            return;
        }
        hashSet.add(ScancodeType.QR);
        hashSet.add(ScancodeType.MEDICINE);
        hashSet.add(ScancodeType.PRODUCT);
        hashSet.add(ScancodeType.EXPRESS);
        hashSet.add(ScancodeType.GEN3);
        hashSet.add(ScancodeType.TB_4G);
    }

    private String addCallbackReceiver(final Context context, final a.InterfaceC0570a interfaceC0570a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7e64dce", new Object[]{this, context, interfaceC0570a});
        }
        if (interfaceC0570a == null) {
            return null;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.taobao.scancode.uniapi.TBScanCodeAbility.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra(a.GATEWAY_CALLBACK_RESULT_PARAM);
                String str = "onReceive " + serializableExtra;
                if (serializableExtra instanceof ScancodeResult) {
                    interfaceC0570a.a((ScancodeResult) serializableExtra);
                }
                context.unregisterReceiver(this);
                TBScanCodeAbility.access$000(TBScanCodeAbility.this).remove(this);
            }
        };
        String uuid = UUID.randomUUID().toString();
        context.registerReceiver(broadcastReceiver, new IntentFilter(uuid));
        this.mReceiverSet.add(broadcastReceiver);
        return uuid;
    }
}
