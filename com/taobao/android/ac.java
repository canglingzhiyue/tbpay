package com.taobao.android;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import tb.nia;

/* loaded from: classes4.dex */
public class ac implements AliImageCreatorInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final PhenixCreator f8953a;

    public ac(PhenixCreator phenixCreator) {
        this.f8953a = phenixCreator;
    }

    public static nia[] a(a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nia[]) ipChange.ipc$dispatch("b107915d", new Object[]{aVarArr});
        }
        nia[] niaVarArr = new nia[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            niaVarArr[i] = new b(aVarArr[i]);
        }
        return niaVarArr;
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageCreatorInterface a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageCreatorInterface) ipChange.ipc$dispatch("2e6bbd0f", new Object[]{this, new Integer(i)});
        }
        this.f8953a.mo1207placeholder(i);
        return this;
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageCreatorInterface a(i<g> iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageCreatorInterface) ipChange.ipc$dispatch("f1703695", new Object[]{this, iVar});
        }
        this.f8953a.failListener(new h(iVar));
        return this;
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageCreatorInterface b(i<l> iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageCreatorInterface) ipChange.ipc$dispatch("d49be9d6", new Object[]{this, iVar});
        }
        this.f8953a.succListener(new m(iVar));
        return this;
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageTicketInterface a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageTicketInterface) ipChange.ipc$dispatch("e1021ba6", new Object[]{this, imageView}) : new ad(this.f8953a.into(imageView));
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageTicketInterface a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageTicketInterface) ipChange.ipc$dispatch("180685a0", new Object[]{this}) : new ad(this.f8953a.fetch());
    }
}
