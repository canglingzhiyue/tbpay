package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageStrategyConfigBuilderInterface;
import com.taobao.tao.image.ImageStrategyConfig;

/* loaded from: classes4.dex */
public class y implements AliImageStrategyConfigBuilderInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ImageStrategyConfig.a f16277a;

    @Override // com.taobao.android.AliImageStrategyConfigBuilderInterface
    public /* synthetic */ AliImageStrategyConfigBuilderInterface a(AliImageStrategyConfigBuilderInterface.AliSizeLimitType aliSizeLimitType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageStrategyConfigBuilderInterface) ipChange.ipc$dispatch("d1356a0e", new Object[]{this, aliSizeLimitType}) : b(aliSizeLimitType);
    }

    public y(ImageStrategyConfig.a aVar) {
        this.f16277a = aVar;
    }

    public y b(AliImageStrategyConfigBuilderInterface.AliSizeLimitType aliSizeLimitType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y) ipChange.ipc$dispatch("f060fd5e", new Object[]{this, aliSizeLimitType});
        }
        this.f16277a.a(ImageStrategyConfig.SizeLimitType.valueOf(aliSizeLimitType.toString()));
        return this;
    }

    @Override // com.taobao.android.AliImageStrategyConfigBuilderInterface
    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f16277a.a();
    }
}
