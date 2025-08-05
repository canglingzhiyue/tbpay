package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.packages.downloader.a;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackRequest;
import com.taobao.zcache.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<no name provided>", "", "packName", "", "error", "Lcom/taobao/zcache/Error;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1 extends Lambda implements ruw<String, Error, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a.b $downloadCallback;
    public final /* synthetic */ PackRequest $packRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1(a.b bVar, PackRequest packRequest) {
        super(2);
        this.$downloadCallback = bVar;
        this.$packRequest = packRequest;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(String str, Error error) {
        invoke2(str, error);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Error error) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556a3544", new Object[]{this, str, error});
        } else if (str == null) {
            a.b bVar = this.$downloadCallback;
            if (bVar == null) {
                return;
            }
            if (error != null) {
                i = error.getCode();
            }
            bVar.a(new a.C0963a(i, "no packName return"));
        } else if (error == null || error.getCode() == 0) {
            String a2 = n.a(this.$packRequest.getName(), this.$packRequest.getInfo());
            if (a2 != null) {
                if (a2.length() == 0) {
                    i = 1;
                }
                if (i == 0) {
                    a.b bVar2 = this.$downloadCallback;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a(a2);
                    return;
                }
            }
            a.b bVar3 = this.$downloadCallback;
            if (bVar3 == null) {
                return;
            }
            bVar3.a(new a.C0963a(1, "callback success but path null"));
        } else {
            a.b bVar4 = this.$downloadCallback;
            if (bVar4 == null) {
                return;
            }
            bVar4.a(new a.C0963a(error.getCode(), error.getMessage()));
        }
    }
}
