package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.cun;

/* loaded from: classes4.dex */
public class FBSingleFileContent {

    /* renamed from: a  reason: collision with root package name */
    public static final com.flybird.support.basics.b<FBSingleFileContent, Void> f7215a = new com.flybird.support.basics.b<FBSingleFileContent, Void>() { // from class: com.flybird.deploy.model.FBSingleFileContent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, com.flybird.deploy.model.FBSingleFileContent] */
        @Override // com.flybird.support.basics.b
        public FBSingleFileContent a(String str, Void r5, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, r5, th});
            }
            cun.a(th, str);
            return null;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.flybird.deploy.model.FBSingleFileContent] */
        @Override // com.flybird.support.basics.b
        public FBSingleFileContent a(File file, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r5}) : new FBSingleFileContent(file, ContentType.File);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.flybird.deploy.model.FBSingleFileContent] */
        @Override // com.flybird.support.basics.b
        public FBSingleFileContent a(String str, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r5}) : new FBSingleFileContent(str, ContentType.String);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.flybird.deploy.model.FBSingleFileContent] */
        @Override // com.flybird.support.basics.b
        public FBSingleFileContent a(byte[] bArr, Void r5) throws Throwable {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r5}) : new FBSingleFileContent(bArr, ContentType.Bytes);
        }
    };
    public final ContentType b;
    public final Object c;

    /* loaded from: classes4.dex */
    public enum ContentType {
        Bytes,
        String,
        File
    }

    public FBSingleFileContent(Object obj, ContentType contentType) {
        this.c = obj;
        this.b = contentType;
    }
}
