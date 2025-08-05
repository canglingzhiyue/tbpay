package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/* loaded from: classes4.dex */
public class O00oOooO {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String O000000o(android.content.Context r5) {
        /*
            r0 = 0
            java.io.File r5 = O00000o0(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto La3
            boolean r2 = r5.exists()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto L14
            goto La3
        L14:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L5b
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L52
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L52
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4b
        L23:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L2d
            r1.append(r4)     // Catch: java.lang.Throwable -> L46
            goto L23
        L2d:
            r3.close()     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> La6
            goto L35
        L31:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> La6
        L35:
            r5.close()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> La6
            goto L3d
        L39:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La6
        L3d:
            r2.close()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La6
            goto L7e
        L41:
            r5 = move-exception
        L42:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La6
            goto L7e
        L46:
            r4 = move-exception
            goto L5f
        L48:
            r1 = move-exception
            r3 = r0
            goto L84
        L4b:
            r4 = move-exception
            r3 = r0
            goto L5f
        L4e:
            r1 = move-exception
            r5 = r0
            r3 = r5
            goto L84
        L52:
            r4 = move-exception
            r5 = r0
            r3 = r5
            goto L5f
        L56:
            r1 = move-exception
            r5 = r0
            r2 = r5
            r3 = r2
            goto L84
        L5b:
            r4 = move-exception
            r5 = r0
            r2 = r5
            r3 = r2
        L5f:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L6c
            r3.close()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La6
            goto L6c
        L68:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> La6
        L6c:
            if (r5 == 0) goto L76
            r5.close()     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> La6
            goto L76
        L72:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La6
        L76:
            if (r2 == 0) goto L7e
            r2.close()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La6
            goto L7e
        L7c:
            r5 = move-exception
            goto L42
        L7e:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> La6
            return r5
        L83:
            r1 = move-exception
        L84:
            if (r3 == 0) goto L8e
            r3.close()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> La6
            goto L8e
        L8a:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> La6
        L8e:
            if (r5 == 0) goto L98
            r5.close()     // Catch: java.lang.Exception -> L94 java.lang.Throwable -> La6
            goto L98
        L94:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La6
        L98:
            if (r2 == 0) goto La2
            r2.close()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> La6
            goto La2
        L9e:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> La6
        La2:
            throw r1     // Catch: java.lang.Throwable -> La6
        La3:
            java.lang.String r5 = ""
            return r5
        La6:
            r5 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r5)     // Catch: java.lang.Throwable -> Lab
            return r0
        Lab:
            r5 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00oOooO.O000000o(android.content.Context):java.lang.String");
    }

    public static void O000000o(Context context, String str) {
        try {
            File O00000o0 = O00000o0(context);
            if (O00000o0 == null || !O00000o0.exists()) {
                O000000o(O00000Oo(context), str);
            } else {
                O000000o(O00000o0, str);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static void O000000o(File file, String str) {
        BufferedWriter bufferedWriter;
        FileWriter fileWriter;
        if (file != null) {
            try {
                if (!file.exists()) {
                    return;
                }
                BufferedWriter bufferedWriter2 = null;
                try {
                    fileWriter = new FileWriter(file, false);
                    try {
                        try {
                            bufferedWriter = new BufferedWriter(fileWriter);
                            try {
                                if (TextUtils.isEmpty(str)) {
                                    str = "";
                                }
                                bufferedWriter.write(str);
                                bufferedWriter.flush();
                                try {
                                    bufferedWriter.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                try {
                                    fileWriter.close();
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace();
                                }
                            } catch (Exception e3) {
                                e = e3;
                                bufferedWriter2 = bufferedWriter;
                                e.printStackTrace();
                                if (bufferedWriter2 != null) {
                                    try {
                                        bufferedWriter2.close();
                                    } catch (Exception e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (fileWriter == null) {
                                    return;
                                }
                                try {
                                    fileWriter.close();
                                } catch (Exception e5) {
                                    e = e5;
                                    e.printStackTrace();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (Exception e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (fileWriter != null) {
                                    try {
                                        fileWriter.close();
                                    } catch (Exception e7) {
                                        e7.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                        }
                    } catch (Exception e8) {
                        e = e8;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = null;
                    fileWriter = null;
                }
            } catch (Throwable th4) {
                try {
                    ExceptionProcessor.processException(th4);
                } catch (Throwable th5) {
                    ExceptionProcessor.processException(th5);
                }
            }
        }
    }

    private static File O00000Oo(Context context) {
        try {
            if (context != null) {
                try {
                    File file = new File(context.getFilesDir() + "/eAccount/Log/");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, "ipa_ol.ds");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    return file2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static File O00000o0(Context context) {
        try {
            if (context != null) {
                try {
                    File file = new File(context.getFilesDir() + "/eAccount/Log/");
                    if (!file.exists()) {
                        return null;
                    }
                    File file2 = new File(file, "ipa_ol.ds");
                    if (file2.exists()) {
                        return file2;
                    }
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
