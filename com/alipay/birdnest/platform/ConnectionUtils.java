package com.alipay.birdnest.platform;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alipay.birdnest.util.FBLabelSpanUtil$ClickMoreListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBLabel;
import com.flybird.FBView;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.FBTemplateStorage$StorageType;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.d;
import com.flybird.deploy.model.e;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.support.basics.KVStorage;
import com.flybird.support.basics.b;
import com.flybird.support.basics.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import tb.cun;
import tb.drm;
import tb.idx;
import tb.ieb;
import tb.iec;
import tb.ied;

/* loaded from: classes3.dex */
public final class ConnectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(File file, File file2) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            if (file.isFile()) {
                if (!file2.exists()) {
                    if (file2.mkdirs()) {
                        byte[] bArr = new byte[1024];
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                String name = nextEntry.getName();
                                if (!nextEntry.isDirectory() && name != null && !name.contains("../")) {
                                    File file3 = new File(file2 + File.separator + name);
                                    new File(file3.getParent()).mkdirs();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.close();
                                }
                                zipInputStream.closeEntry();
                            }
                            zipInputStream.closeEntry();
                            zipInputStream.close();
                            fileInputStream.close();
                            try {
                                new File(file2, ".__done__").createNewFile();
                                return;
                            } catch (IOException e) {
                                throw new RuntimeException("failed to create __done__ file", e);
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException("failed to unzip file", e2);
                        }
                    }
                    throw new RuntimeException("mkdir failed: " + file2);
                }
                throw new RuntimeException("destDir exists: " + file2);
            } else {
                throw new RuntimeException("zip file not exists: " + file);
            }
        }
        ipChange.ipc$dispatch("a3abf716", new Object[]{file, file2});
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Throwable th) {
            cun.a(th, "decode utf-8 error");
            return null;
        }
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f6d5d94c", new Object[]{bArr});
        }
        ieb.a();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr2 = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = gZIPInputStream.read(bArr2, 0, 4096);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            cun.a(th, "ungzip error");
            return null;
        }
    }

    public static JSONObject d(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df1cfc63", new Object[]{str});
        }
        try {
            return new JSONObject(str);
        } catch (Throwable th) {
            cun.a(th, "toJson error");
            return null;
        }
    }

    public static synchronized File e(String str, String str2) throws Exception {
        synchronized (ConnectionUtils.class) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("3334fb8d", new Object[]{str, str2});
            }
            String a2 = a(str, str2, FBTemplateStorage$StorageType.DEFAULT);
            String b = b(a2);
            File a3 = c.a("fb__tpl_storage/pack", a2, true);
            if (a3 != null) {
                File d = c.d("fb__tpl_storage/pack", b);
                if (d.exists() && d.isDirectory()) {
                    z = new File(d, ".__done__").exists();
                }
                if (z) {
                    return a3;
                }
            }
            return null;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            return null;
        }
        return str + "@" + str2;
    }

    public static File d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("19197cee", new Object[]{str, str2});
        }
        if (!AppContextHolder.b) {
            cun.a("not supported");
        }
        cun.c("getFileFromOverrideZip called on " + str + ":" + str2);
        return new File(c.a(str), str2);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        return str + "_extracted";
    }

    public static iec c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iec) ipChange.ipc$dispatch("7dc9e76b", new Object[]{str});
        }
        iec iecVar = new iec();
        if (str != null) {
            int indexOf = str.indexOf(64);
            int lastIndexOf = str.substring(0, indexOf == -1 ? str.length() : indexOf).lastIndexOf(47);
            String str3 = "";
            if (lastIndexOf != -1 && indexOf != -1) {
                str3 = str.substring(0, lastIndexOf);
                str2 = str.substring(lastIndexOf + 1, indexOf);
                str = str.substring(indexOf + 1);
            } else if (lastIndexOf != -1) {
                String substring = str.substring(0, lastIndexOf);
                str = str.substring(lastIndexOf + 1);
                str2 = str3;
                str3 = substring;
            } else if (indexOf != -1) {
                str2 = str.substring(0, indexOf);
                str = str.substring(indexOf + 1);
            } else {
                str2 = str3;
            }
            String str4 = null;
            if (str3.length() <= 0) {
                str3 = null;
            }
            iecVar.f28959a = str3;
            iecVar.b = str2.length() > 0 ? str2 : null;
            if (str.length() > 0) {
                str4 = str;
            }
            iecVar.c = str4;
            if (str2.length() > 0 && str.length() > 0) {
                b(str2, str);
            }
        }
        return iecVar;
    }

    public static void a(final TextView textView, String str, SpannableStringBuilder spannableStringBuilder, final FBLabelSpanUtil$ClickMoreListener fBLabelSpanUtil$ClickMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3518ef71", new Object[]{textView, str, spannableStringBuilder, fBLabelSpanUtil$ClickMoreListener});
        } else if (StringUtils.isEmpty(textView.getText())) {
            cun.a("FBLabelSpanUtil", "textView:" + ((Object) textView.getText()));
        } else {
            cun.b("FBLabelSpanUtil", "toggleEllipsize textView:" + textView);
            try {
                textView.getContext();
                String str2 = Platform.f5257a;
            } catch (Exception unused) {
            }
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.birdnest.platform.-$$Lambda$7sZ2d1C7Ta7zhg9tc9HqrNvjHdA
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ConnectionUtils.a(textView, view, motionEvent);
                }
            });
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(textView, spannableStringBuilder, str, "...", "全部", new ClickableSpan() { // from class: com.alipay.birdnest.util.FBLabelSpanUtil$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(FBLabelSpanUtil$1 fBLabelSpanUtil$1, String str3, Object... objArr) {
                    if (str3.hashCode() == -1038128277) {
                        super.updateDrawState((TextPaint) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    FBLabel fBLabel = (FBLabel) FBLabelSpanUtil$ClickMoreListener.this;
                    if (fBLabel.isDestroyed()) {
                        return;
                    }
                    FBView.nativePlatformOnMoreClick(fBLabel.mNode);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(Color.parseColor("#1677ff"));
                }
            }) { // from class: com.alipay.birdnest.util.FBLabelSpanUtil$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ TextView f5269a;
                public final /* synthetic */ SpannableStringBuilder b;
                public final /* synthetic */ String c;
                public final /* synthetic */ ClickableSpan d;

                {
                    this.d = r6;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0102, code lost:
                    if (r14 == r10) goto L37;
                 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onGlobalLayout() {
                    /*
                        Method dump skipped, instructions count: 465
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.util.FBLabelSpanUtil$2.onGlobalLayout():void");
                }
            });
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        return "js__" + ied.a(str, "") + "__" + ied.a(str2, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x003b, code lost:
        if (r3 != 9) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.birdnest.platform.ConnectionUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "bbc5dc40"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = 5
            r1 = 6
            java.lang.String r3 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r3)     // Catch: java.lang.Exception -> L4d
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L4d
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L4d
            boolean r3 = r4.isConnected()     // Catch: java.lang.Exception -> L4d
            if (r3 != 0) goto L2d
            r2 = 6
            goto L4e
        L2d:
            int r3 = r4.getType()     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L3f
            if (r3 == r2) goto L3d
            if (r3 == r0) goto L3f
            if (r3 == r1) goto L3d
            r4 = 9
            if (r3 != r4) goto L4d
        L3d:
            r2 = 5
            goto L4e
        L3f:
            int r4 = r4.getSubtype()     // Catch: java.lang.Exception -> L4d
            switch(r4) {
                case 1: goto L4e;
                case 2: goto L4e;
                case 3: goto L4b;
                case 4: goto L4e;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4e;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4e;
                case 12: goto L4b;
                case 13: goto L49;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L4e;
                case 17: goto L4b;
                case 18: goto L49;
                case 19: goto L49;
                case 20: goto L47;
                default: goto L46;
            }
        L46:
            goto L4d
        L47:
            r2 = 4
            goto L4e
        L49:
            r2 = 3
            goto L4e
        L4b:
            r2 = 2
            goto L4e
        L4d:
            r2 = 7
        L4e:
            switch(r2) {
                case 1: goto L63;
                case 2: goto L60;
                case 3: goto L5d;
                case 4: goto L5a;
                case 5: goto L57;
                case 6: goto L54;
                default: goto L51;
            }
        L51:
            java.lang.String r4 = "INVALID"
            return r4
        L54:
            java.lang.String r4 = "NO"
            return r4
        L57:
            java.lang.String r4 = "WIFI"
            return r4
        L5a:
            java.lang.String r4 = "5G"
            return r4
        L5d:
            java.lang.String r4 = "4G"
            return r4
        L60:
            java.lang.String r4 = "3G"
            return r4
        L63:
            java.lang.String r4 = "2G"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.platform.ConnectionUtils.a(android.content.Context):java.lang.String");
    }

    public static /* synthetic */ boolean a(TextView textView, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a091270f", new Object[]{textView, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            if (((ClickableSpan[]) new SpannableString(textView.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length != 0) {
                return false;
            }
            textView.performClick();
        }
        return true;
    }

    public static synchronized void a(FBTemplateDecider fBTemplateDecider, FBTemplateContent fBTemplateContent, int i) throws Exception {
        synchronized (ConnectionUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58d56080", new Object[]{fBTemplateDecider, fBTemplateContent, new Integer(i)});
                return;
            }
            FBTemplateStorage$StorageType a2 = a(i);
            e a3 = FBTemplateDecider.a(fBTemplateDecider);
            cun.a(a3, "missing decider");
            String b = a3.b();
            String b2 = FBTemplateDecider.b(fBTemplateDecider);
            iec c = c(fBTemplateContent.getTplId());
            String str = c.f28959a;
            String str2 = c.b;
            String str3 = c.c;
            String str4 = ied.a(a2.pathPart, "") + "__" + ied.a(str, b, "") + "__" + ied.a(str2, b2, "") + "@" + ied.a(str3);
            File c2 = c.c("fb__tpl_storage", str4);
            if (c2.exists()) {
                c2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(c2, false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            KVStorage.setKeyValue("fb__kv_checksum", "fb__tpl_storage_" + str4, String.valueOf(fBTemplateContent.toChecksum()));
            objectOutputStream.writeObject(fBTemplateContent);
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static FBTemplateContent a(FBTemplateDecider fBTemplateDecider, d dVar, int i) throws Exception {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("6a8da3be", new Object[]{fBTemplateDecider, dVar, new Integer(i)});
        }
        String a2 = a(fBTemplateDecider, dVar, a(i));
        b<Pair<File, Long>, Pair<File, Boolean>> bVar = c.f7232a;
        ieb.a();
        File c = c.c("fb__tpl_storage", a2);
        Serializable serializable = null;
        if (c.exists()) {
            FileInputStream fileInputStream = new FileInputStream(c);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                Object readObject = objectInputStream.readObject();
                if (!FBTemplateContent.class.isInstance(readObject)) {
                    cun.a("read result is not an " + FBTemplateContent.class + " instance, but " + readObject.getClass());
                } else if (!(readObject instanceof Serializable)) {
                    cun.a("read result is not serializable");
                } else if (!(readObject instanceof idx)) {
                    cun.a("read result has not checksum");
                } else {
                    String keyValue = KVStorage.getKeyValue("fb__kv_checksum", "fb__tpl_storage_" + a2);
                    if (keyValue == null) {
                        cun.a("no expected checksum");
                    } else {
                        if (((idx) readObject).toChecksum() != Long.parseLong(keyValue)) {
                            z = false;
                        }
                        if (!z) {
                            cun.a("checksum failed");
                        } else {
                            objectInputStream.close();
                            fileInputStream.close();
                            serializable = (Serializable) readObject;
                        }
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        FBTemplateContent fBTemplateContent = (FBTemplateContent) serializable;
        if (fBTemplateContent != null && !fBTemplateContent.verifyDataChecksumIfPreset()) {
            throw new RuntimeException("fbTemplateContent 'data' checksum failed");
        }
        return fBTemplateContent;
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        try {
            return str.getBytes("utf-8");
        } catch (Throwable th) {
            cun.a(th, "encode utf-8 error");
            return null;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        iec c = c(str);
        String str3 = c.b;
        if (str3 != null) {
            str2 = str3;
        }
        return b(str2, c.c);
    }

    public static synchronized void a(final String str, String str2, Object obj) throws Exception {
        synchronized (ConnectionUtils.class) {
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45199658", new Object[]{str, str2, obj});
                return;
            }
            ieb.a();
            String a2 = a(str, str2, FBTemplateStorage$StorageType.DEFAULT);
            File a3 = c.a("fb__tpl_storage/pack", a2, obj, true);
            if (a3 == null || !a3.isFile()) {
                cun.a("cannot write zip file " + a2);
            }
            String b = b(a2);
            ieb.a();
            if (b.isEmpty()) {
                cun.a("target folder/subfolder missingfb__tpl_storage/pack : " + b);
            }
            File d = c.d("fb__tpl_storage/pack", b);
            c.f("fb__tpl_storage/pack", b);
            a(c.e("fb__tpl_storage/pack", a2), d);
            Integer num = (Integer) drm.b("Conf:bn_deploy_package_cache_count");
            if (num != null) {
                i = num.intValue();
            }
            cun.c("FBTemplateStorage", "maxNumToKeep: " + i);
            if (i > 0) {
                List<File> a4 = c.a("fb__tpl_storage/pack", (String) null, new FileFilter() { // from class: com.alipay.birdnest.platform.-$$Lambda$4-f-mzkUxxKzaOklqJ7buj-QWx8
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return ConnectionUtils.a(str, file);
                    }
                });
                cun.c("FBTemplateStorage", "cleaning, all files: " + a4);
                for (int i2 = 0; i2 < a4.size() - i; i2++) {
                    File file = a4.get(i2);
                    c.a("fb__tpl_storage/pack", file.getName());
                    cun.c("FBTemplateStorage", "cleaning, deleted " + file);
                    String b2 = b(file.getName());
                    c.b("fb__tpl_storage/pack", b2);
                    cun.c("FBTemplateStorage", "cleaning, deleted dir " + b2);
                }
            }
        }
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b & 240) >> 4, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean a(String str, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9c1162d", new Object[]{str, file})).booleanValue() : file.isFile() && file.getName().startsWith(a(str, FBTemplateStorage$StorageType.DEFAULT)) && file.getName().endsWith(".zip");
    }

    public static int a(TextView textView, int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4ac8d77", new Object[]{textView, new Integer(i), new Integer(i2), charSequence, charSequence2})).intValue();
        }
        textView.setText(((Object) charSequence.subSequence(i, i2)) + charSequence2.toString());
        return textView.getLayout().getLineCount();
    }

    public static FBTemplateStorage$StorageType a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateStorage$StorageType) ipChange.ipc$dispatch("6488432b", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return FBTemplateStorage$StorageType.DEFAULT;
        }
        if (i == 1) {
            return FBTemplateStorage$StorageType.GRAY;
        }
        if (i != 2) {
            cun.a("unknown storage type " + i);
            return null;
        }
        return FBTemplateStorage$StorageType.EXP;
    }

    public static String a(FBTemplateDecider fBTemplateDecider, d dVar, FBTemplateStorage$StorageType fBTemplateStorage$StorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a94652e", new Object[]{fBTemplateDecider, dVar, fBTemplateStorage$StorageType});
        }
        e a2 = FBTemplateDecider.a(fBTemplateDecider);
        cun.a(a2, "missing decider");
        String b = a2.b();
        String b2 = FBTemplateDecider.b(fBTemplateDecider);
        iec c = c(dVar.a());
        String str = c.f28959a;
        String str2 = c.b;
        String str3 = c.c;
        return ied.a(fBTemplateStorage$StorageType.pathPart, "") + "__" + ied.a(str, b, "") + "__" + ied.a(str2, b2, "") + "@" + ied.a(str3);
    }

    public static String a(String str, String str2, FBTemplateStorage$StorageType fBTemplateStorage$StorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61f07e94", new Object[]{str, str2, fBTemplateStorage$StorageType});
        }
        return a(str, fBTemplateStorage$StorageType) + ied.a(str2, "") + ".zip";
    }

    public static String a(String str, FBTemplateStorage$StorageType fBTemplateStorage$StorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50426c1e", new Object[]{str, fBTemplateStorage$StorageType});
        }
        return "pack__" + ied.a(fBTemplateStorage$StorageType.pathPart, "") + "__" + ied.a(str, "") + "__";
    }
}
