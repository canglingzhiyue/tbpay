package com.alibaba.ability.impl.imagepreview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsImagePreviewAbility;
import com.taobao.android.abilityidl.ability.ImagePreviewCloseResult;
import com.taobao.android.abilityidl.ability.bx;
import com.taobao.android.abilityidl.ability.cu;
import com.taobao.android.abilityidl.ability.cv;
import com.taobao.android.abilityidl.ability.cw;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.megadesign.imagepreview.model.PreviewSourceModel;
import com.taobao.android.nav.Nav;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.amh;
import tb.dvr;
import tb.kge;
import tb.scq;
import tb.scs;

/* loaded from: classes2.dex */
public class ImagePreviewAbility extends AbsImagePreviewAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String IMAGE_PREVIEW_POP_ID = "mega_dark_image_preview";

    /* renamed from: a  reason: collision with root package name */
    private LocalBroadcastManager f1899a;
    private MyBroadCastReceiver b;

    static {
        kge.a(1150180548);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(ImagePreviewAbility imagePreviewAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(401875724);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsImagePreviewAbility
    public void show(als context, cu params, bx callback) {
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        List<cv> list = params.f8799a;
        q.b(list, "params.sources");
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (cv cvVar : list) {
            if (q.a((Object) cvVar.f8800a, (Object) "IMAGE")) {
                String str = cvVar.b;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    arrayList.add(new PreviewSourceModel(cvVar.f8800a, cvVar.b, cvVar.c));
                }
            } else {
                String str2 = cvVar.c;
                if (str2 == null || str2.length() == 0) {
                    z2 = true;
                    z3 = true;
                } else {
                    arrayList.add(new PreviewSourceModel(cvVar.f8800a, cvVar.b, cvVar.c));
                    z2 = true;
                }
            }
        }
        int i = params.b;
        if (i > params.f8799a.size() || i < 0) {
            callback.a(new ErrorResult("INDEX_OUT_OF_RANGE", "索引超出范围", (Map) null, 4, (o) null));
        } else if (z) {
            callback.a(new ErrorResult("MISS_IMAGE_URL", "图片地址缺失", (Map) null, 4, (o) null));
        } else if (z2 && params.c == null) {
            callback.a(new ErrorResult("MISS_VIDEO_PLAYER_CONFIG", "播放器配置缺失", (Map) null, 4, (o) null));
        } else if (z3) {
            callback.a(new ErrorResult("MISS_VIDEO_URL", "视频地址缺失", (Map) null, 4, (o) null));
        } else {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(f);
            MyBroadCastReceiver myBroadCastReceiver = new MyBroadCastReceiver(callback, this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(dvr.ACTION_CLOSE);
            localBroadcastManager.registerReceiver(myBroadCastReceiver, intentFilter);
            t tVar = t.INSTANCE;
            this.b = myBroadCastReceiver;
            t tVar2 = t.INSTANCE;
            this.f1899a = localBroadcastManager;
            bundle.putParcelableArrayList("sources", arrayList);
            bundle.putInt("index", i);
            cw cwVar = params.c;
            bundle.putString("bizCode", cwVar != null ? cwVar.f8801a : null);
            cw cwVar2 = params.c;
            bundle.putBoolean("mute", cwVar2 != null ? cwVar2.b : true);
            if (amh.d()) {
                Nav.from(f).withExtras(bundle).disableTransition().toUri("https://h5.m.taobao.com/darkPage/preview.htm");
                return;
            }
            try {
                Object newInstance = Class.forName("com.taobao.android.rocketmegadesign.imagepreview.DarkPagePreviewFragment").newInstance();
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.Fragment");
                }
                Fragment fragment = (Fragment) newInstance;
                String str3 = q.a((Object) params.d, (Object) "VIEW") ? "view" : "activity";
                fragment.setArguments(bundle);
                scs.a(f, fragment, new JSONObject(ai.b(j.a("popId", IMAGE_PREVIEW_POP_ID), j.a(c.KEY_POP_CONFIG, new JSONObject(ai.b(j.a("maxHeight", 1), j.a("maxWidth", 1), j.a("panEnable", false), j.a("cornerRadius", 0), j.a("attachMode", str3), j.a("animation", "noAnimation")))))), (scq) null);
            } catch (Throwable unused) {
                callback.a(new ErrorResult("INTERNAL_ERROR", "远程化模块还没有被加载", (Map) null, 4, (o) null));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a();
    }

    public final void a() {
        LocalBroadcastManager localBroadcastManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MyBroadCastReceiver myBroadCastReceiver = this.b;
        if (myBroadCastReceiver != null && (localBroadcastManager = this.f1899a) != null) {
            localBroadcastManager.unregisterReceiver(myBroadCastReceiver);
        }
        this.b = null;
        this.f1899a = null;
    }

    /* loaded from: classes2.dex */
    public static final class MyBroadCastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ImagePreviewAbility> f1900a;
        private final bx b;

        static {
            kge.a(-1983825500);
        }

        public MyBroadCastReceiver(bx callback, ImagePreviewAbility ability) {
            q.d(callback, "callback");
            q.d(ability, "ability");
            this.b = callback;
            this.f1900a = new WeakReference<>(ability);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !q.a((Object) dvr.ACTION_CLOSE, (Object) intent.getAction())) {
            } else {
                ImagePreviewCloseResult imagePreviewCloseResult = new ImagePreviewCloseResult();
                imagePreviewCloseResult.type = intent.getStringExtra(dvr.ACTION_CLOSE_TYPE_PARAM);
                imagePreviewCloseResult.index = Integer.valueOf(intent.getIntExtra(dvr.ACTION_CLOSE_INDEX_PARAM, 0));
                this.b.a(imagePreviewCloseResult);
                ImagePreviewAbility imagePreviewAbility = this.f1900a.get();
                if (imagePreviewAbility != null) {
                    imagePreviewAbility.a();
                }
                if (amh.d()) {
                    return;
                }
                scs.a(context, ImagePreviewAbility.IMAGE_PREVIEW_POP_ID);
            }
        }
    }
}
