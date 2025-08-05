package com.taobao.umipublish.extension.windvane.innercall;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.service.b;
import com.taobao.umipublish.extension.windvane.IAlbumFilmBridge;
import tb.ios;
import tb.kge;

/* loaded from: classes9.dex */
public class InnerOpenAlbumFilmAbility extends InnerCallBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(847952485);
    }

    public static /* synthetic */ void a(InnerOpenAlbumFilmAbility innerOpenAlbumFilmAbility, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba30866", new Object[]{innerOpenAlbumFilmAbility, str, str2});
        } else {
            innerOpenAlbumFilmAbility.errorCallback(str, str2);
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.InnerCallBaseAbility
    public void a(JSONObject jSONObject, ios.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e01202e", new Object[]{this, jSONObject, aVar});
            return;
        }
        a(jSONObject);
        ((IAlbumFilmBridge) b.a(IAlbumFilmBridge.class, new Object[0])).openInner(this.mContext, new WVCallBackContext(null) { // from class: com.taobao.umipublish.extension.windvane.innercall.InnerOpenAlbumFilmAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1608264411) {
                    super.error((r) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(r rVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a023d525", new Object[]{this, rVar});
                    return;
                }
                super.error(rVar);
                InnerOpenAlbumFilmAbility.this.a();
                InnerOpenAlbumFilmAbility.a(InnerOpenAlbumFilmAbility.this, "-2", com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED);
            }
        });
    }
}
