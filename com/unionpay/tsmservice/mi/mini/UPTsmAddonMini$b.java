package com.unionpay.tsmservice.mi.mini;

import android.os.Bundle;
import com.unionpay.tsmservice.mi.mini.ITsmCallback;

/* loaded from: classes9.dex */
final class UPTsmAddonMini$b extends ITsmCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f24039a;
    private final ITsmCallback b;
    private final int c;

    private UPTsmAddonMini$b(a aVar, ITsmCallback iTsmCallback, int i) {
        this.f24039a = aVar;
        this.b = iTsmCallback;
        this.c = i;
    }

    /* synthetic */ UPTsmAddonMini$b(a aVar, ITsmCallback iTsmCallback, int i, byte b) {
        this(aVar, iTsmCallback, i);
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onError(String str, String str2) {
        ITsmCallback iTsmCallback = this.b;
        if (iTsmCallback != null) {
            iTsmCallback.onError(str, str2);
        }
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.b != null) {
            bundle.putInt("interfaceId", this.c);
            this.b.onResult(bundle);
        }
    }
}
