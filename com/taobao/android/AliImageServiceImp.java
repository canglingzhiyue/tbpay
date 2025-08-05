package com.taobao.android;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class AliImageServiceImp implements AliImageServiceInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliImageServiceImp f8599a = new AliImageServiceImp();

    public static AliImageServiceImp getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageServiceImp) ipChange.ipc$dispatch("be33a8dc", new Object[0]) : f8599a;
    }

    @Override // com.taobao.android.AliImageServiceInterface
    public AliImageInterface a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageInterface) ipChange.ipc$dispatch("abac25fc", new Object[]{this, context}) : new ab(com.taobao.phenix.intf.b.h().a(context));
    }

    @Override // com.taobao.android.AliImageServiceInterface
    public <T extends View & AliUrlImageViewInterface> T b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context})) : new AliUrlImageView(context);
    }
}
