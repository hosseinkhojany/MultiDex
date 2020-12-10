﻿package com.example.multidex.utils;

import com.example.multidex.data.model.Country
import com.example.multidex.R

class CountryList{
    companion object{
        fun COUNTRIES(): List<Country> {
            return listOf<Country>(
                    Country("AD", "Andorra", "+376", R.raw.flag_ad, "EUR"),
                    Country("AE", "United Arab Emirates", "+971", R.raw.flag_ae, "AED"),
                    Country("AF", "Afghanistan", "+93", R.raw.flag_af, "AFN"),
                    Country("AG", "Antigua and Barbuda", "+1268", R.raw.flag_ag, "XCD"),
                    Country("AI", "Anguilla", "+1264", R.raw.flag_ai, "XCD"),
                    Country("AL", "Albania", "+355", R.raw.flag_al, "ALL"),
                    Country("AM", "Armenia", "+374", R.raw.flag_am, "AMD"),
                    Country("AO", "Angola", "+244", R.raw.flag_ao, "AOA"),
                    Country("AQ", "Antarctica", "+672", R.raw.flag_aq, "USD"),
                    Country("AR", "Argentina", "+54", R.raw.flag_ar, "ARS"),
                    Country("AS", "American Samoa", "+1684", R.raw.flag_as, "USD"),
                    Country("AT", "Austria", "+43", R.raw.flag_at, "EUR"),
                    Country("AU", "Australia", "+61", R.raw.flag_au, "AUD"),
                    Country("AW", "Aruba", "+297", R.raw.flag_aw, "AWG"),
                    Country("AX", "Aland Islands", "+358", R.raw.flag_ax, "EUR"),
                    Country("AZ", "Azerbaijan", "+994", R.raw.flag_az, "AZN"),
                    Country("BA", "Bosnia and Herzegovina", "+387", R.raw.flag_ba, "BAM"),
                    Country("BB", "Barbados", "+1246", R.raw.flag_bb, "BBD"),
                    Country("BD", "Bangladesh", "+880", R.raw.flag_bd, "BDT"),
                    Country("BE", "Belgium", "+32", R.raw.flag_be, "EUR"),
                    Country("BF", "Burkina Faso", "+226", R.raw.flag_bf, "XOF"),
                    Country("BG", "Bulgaria", "+359", R.raw.flag_bg, "BGN"),
                    Country("BH", "Bahrain", "+973", R.raw.flag_bh, "BHD"),
                    Country("BI", "Burundi", "+257", R.raw.flag_bi, "BIF"),
                    Country("BJ", "Benin", "+229", R.raw.flag_bj, "XOF"),
                    Country("BL", "Saint Barthelemy", "+590", R.raw.flag_bl, "EUR"),
                    Country("BM", "Bermuda", "+1441", R.raw.flag_bm, "BMD"),
                    Country("BN", "Brunei Darussalam", "+673", R.raw.flag_bn, "BND"),
                    Country("BO", "Bolivia, Plurinational State of", "+591", R.raw.flag_bo, "BOB"),
                    Country("BQ", "Bonaire", "+599", R.raw.flag_bq, "USD"),
                    Country("BR", "Brazil", "+55", R.raw.flag_br, "BRL"),
                    Country("BS", "Bahamas", "+1242", R.raw.flag_bs, "BSD"),
                    Country("BT", "Bhutan", "+975", R.raw.flag_bt, "BTN"),
                    Country("BV", "Bouvet Island", "+47", R.raw.flag_bv, "NOK"),
                    Country("BW", "Botswana", "+267", R.raw.flag_bw, "BWP"),
                    Country("BY", "Belarus", "+375", R.raw.flag_by, "BYR"),
                    Country("BZ", "Belize", "+501", R.raw.flag_bz, "BZD"),
                    Country("CA", "Canada", "+1", R.raw.flag_ca, "CAD"),
                    Country("CC", "Cocos (Keeling) Islands", "+61", R.raw.flag_cc, "AUD"),
                    Country("CD", "Congo, The Democratic Republic of the", "+243", R.raw.flag_cd, "CDF"),
                    Country("CF", "Central African Republic", "+236", R.raw.flag_cf, "XAF"),
                    Country("CG", "Congo", "+242", R.raw.flag_cg, "XAF"),
                    Country("CH", "Switzerland", "+41", R.raw.flag_ch, "CHF"),
                    Country("CI", "Ivory Coast", "+225", R.raw.flag_ci, "XOF"),
                    Country("CK", "Cook Islands", "+682", R.raw.flag_ck, "NZD"),
                    Country("CL", "Chile", "+56", R.raw.flag_cl, "CLP"),
                    Country("CM", "Cameroon", "+237", R.raw.flag_cm, "XAF"),
                    Country("CN", "China", "+86", R.raw.flag_cn, "CNY"),
                    Country("CO", "Colombia", "+57", R.raw.flag_co, "COP"),
                    Country("CR", "Costa Rica", "+506", R.raw.flag_cr, "CRC"),
                    Country("CU", "Cuba", "+53", R.raw.flag_cu, "CUP"),
                    Country("CV", "Cape Verde", "+238", R.raw.flag_cv, "CVE"),
                    Country("CW", "Curacao", "+599", R.raw.flag_cw, "ANG"),
                    Country("CX", "Christmas Island", "+61", R.raw.flag_cx, "AUD"),
                    Country("CY", "Cyprus", "+357", R.raw.flag_cy, "EUR"),
                    Country("CZ", "Czech Republic", "+420", R.raw.flag_cz, "CZK"),
                    Country("DE", "Germany", "+49", R.raw.flag_de, "EUR"),
                    Country("DJ", "Djibouti", "+253", R.raw.flag_dj, "DJF"),
                    Country("DK", "Denmark", "+45", R.raw.flag_dk, "DKK"),
                    Country("DM", "Dominica", "+1767", R.raw.flag_dm, "XCD"),
                    Country("DO", "Dominican Republic", "+1", R.raw.flag_do, "DOP"),
                    Country("DZ", "Algeria", "+213", R.raw.flag_dz, "DZD"),
                    Country("EC", "Ecuador", "+593", R.raw.flag_ec, "USD"),
                    Country("EE", "Estonia", "+372", R.raw.flag_ee, "EUR"),
                    Country("EG", "Egypt", "+20", R.raw.flag_eg, "EGP"),
                    Country("EH", "Western Sahara", "+212", R.raw.flag_eh, "MAD"),
                    Country("ER", "Eritrea", "+291", R.raw.flag_er, "ERN"),
                    Country("ES", "Spain", "+34", R.raw.flag_es, "EUR"),
                    Country("ET", "Ethiopia", "+251", R.raw.flag_et, "ETB"),
                    Country("FI", "Finland", "+358", R.raw.flag_fi, "EUR"),
                    Country("FJ", "Fiji", "+679", R.raw.flag_fj, "FJD"),
                    Country("FK", "Falkland Islands (Malvinas)", "+500", R.raw.flag_fk, "FKP"),
                    Country("FM", "Micronesia, Federated States of", "+691", R.raw.flag_fm, "USD"),
                    Country("FO", "Faroe Islands", "+298", R.raw.flag_fo, "DKK"),
                    Country("FR", "France", "+33", R.raw.flag_fr, "EUR"),
                    Country("GA", "Gabon", "+241", R.raw.flag_ga, "XAF"),
                    Country("GB", "United Kingdom", "+44", R.raw.flag_gb, "GBP"),
                    Country("GD", "Grenada", "+1473", R.raw.flag_gd, "XCD"),
                    Country("GE", "Georgia", "+995", R.raw.flag_ge, "GEL"),
                    Country("GF", "French Guiana", "+594", R.raw.flag_gf, "EUR"),
                    Country("GG", "Guernsey", "+44", R.raw.flag_gg, "GGP"),
                    Country("GH", "Ghana", "+233", R.raw.flag_gh, "GHS"),
                    Country("GI", "Gibraltar", "+350", R.raw.flag_gi, "GIP"),
                    Country("GL", "Greenland", "+299", R.raw.flag_gl, "DKK"),
                    Country("GM", "Gambia", "+220", R.raw.flag_gm, "GMD"),
                    Country("GN", "Guinea", "+224", R.raw.flag_gn, "GNF"),
                    Country("GP", "Guadeloupe", "+590", R.raw.flag_gp, "EUR"),
                    Country("GQ", "Equatorial Guinea", "+240", R.raw.flag_gq, "XAF"),
                    Country("GR", "Greece", "+30", R.raw.flag_gr, "EUR"),
                    Country("GS", "South Georgia and the South Sandwich Islands", "+500", R.raw.flag_gs, "GBP"),
                    Country("GT", "Guatemala", "+502", R.raw.flag_gt, "GTQ"),
                    Country("GU", "Guam", "+1671", R.raw.flag_gu, "USD"),
                    Country("GW", "Guinea-Bissau", "+245", R.raw.flag_gw, "XOF"),
                    Country("GY", "Guyana", "+595", R.raw.flag_gy, "GYD"),
                    Country("HK", "Hong Kong", "+852", R.raw.flag_hk, "HKD"),
                    Country("HM", "Heard Island and McDonald Islands", "+000", R.raw.flag_hm, "AUD"),
                    Country("HN", "Honduras", "+504", R.raw.flag_hn, "HNL"),
                    Country("HR", "Croatia", "+385", R.raw.flag_hr, "HRK"),
                    Country("HT", "Haiti", "+509", R.raw.flag_ht, "HTG"),
                    Country("HU", "Hungary", "+36", R.raw.flag_hu, "HUF"),
                    Country("ID", "Indonesia", "+62", R.raw.flag_id, "IDR"),
                    Country("IE", "Ireland", "+353", R.raw.flag_ie, "EUR"),
                    Country("IM", "Isle of Man", "+44", R.raw.flag_im, "GBP"),
                    Country("IN", "India", "+91", R.raw.flag_in, "INR"),
                    Country("IO", "British Indian Ocean Territory", "+246", R.raw.flag_io, "USD"),
                    Country("IQ", "Iraq", "+964", R.raw.flag_iq, "IQD"),
                    Country("IR", "Iran", "+98", R.raw.flag_ir, "IRR"),
                    Country("IS", "Iceland", "+354", R.raw.flag_is, "ISK"),
                    Country("IT", "Italy", "+39", R.raw.flag_it, "EUR"),
                    Country("JE", "Jersey", "+44", R.raw.flag_je, "JEP"),
                    Country("JM", "Jamaica", "+1876", R.raw.flag_jm, "JMD"),
                    Country("JO", "Jordan", "+962", R.raw.flag_jo, "JOD"),
                    Country("JP", "Japan", "+81", R.raw.flag_jp, "JPY"),
                    Country("KE", "Kenya", "+254", R.raw.flag_ke, "KES"),
                    Country("KG", "Kyrgyzstan", "+996", R.raw.flag_kg, "KGS"),
                    Country("KH", "Cambodia", "+855", R.raw.flag_kh, "KHR"),
                    Country("KI", "Kiribati", "+686", R.raw.flag_ki, "AUD"),
                    Country("KM", "Comoros", "+269", R.raw.flag_km, "KMF"),
                    Country("KN", "Saint Kitts and Nevis", "+1869", R.raw.flag_kn, "XCD"),
                    Country("KP", "North Korea", "+850", R.raw.flag_kp, "KPW"),
                    Country("KR", "South Korea", "+82", R.raw.flag_kr, "KRW"),
                    Country("KW", "Kuwait", "+965", R.raw.flag_kw, "KWD"),
                    Country("KY", "Cayman Islands", "+345", R.raw.flag_ky, "KYD"),
                    Country("KZ", "Kazakhstan", "+7", R.raw.flag_kz, "KZT"),
                    Country("LA", "Lao People's Democratic Republic", "+856", R.raw.flag_la, "LAK"),
                    Country("LB", "Lebanon", "+961", R.raw.flag_lb, "LBP"),
                    Country("LC", "Saint Lucia", "+1758", R.raw.flag_lc, "XCD"),
                    Country("LI", "Liechtenstein", "+423", R.raw.flag_li, "CHF"),
                    Country("LK", "Sri Lanka", "+94", R.raw.flag_lk, "LKR"),
                    Country("LR", "Liberia", "+231", R.raw.flag_lr, "LRD"),
                    Country("LS", "Lesotho", "+266", R.raw.flag_ls, "LSL"),
                    Country("LT", "Lithuania", "+370", R.raw.flag_lt, "LTL"),
                    Country("LU", "Luxembourg", "+352", R.raw.flag_lu, "EUR"),
                    Country("LV", "Latvia", "+371", R.raw.flag_lv, "LVL"),
                    Country("LY", "Libyan Arab Jamahiriya", "+218", R.raw.flag_ly, "LYD"),
                    Country("MA", "Morocco", "+212", R.raw.flag_ma, "MAD"),
                    Country("MC", "Monaco", "+377", R.raw.flag_mc, "EUR"),
                    Country("MD", "Moldova, Republic of", "+373", R.raw.flag_md, "MDL"),
                    Country("ME", "Montenegro", "+382", R.raw.flag_me, "EUR"),
                    Country("MF", "Saint Martin", "+590", R.raw.flag_mf, "EUR"),
                    Country("MG", "Madagascar", "+261", R.raw.flag_mg, "MGA"),
                    Country("MH", "Marshall Islands", "+692", R.raw.flag_mh, "USD"),
                    Country("MK", "Macedonia, The Former Yugoslav Republic of", "+389", R.raw.flag_mk,
                            "MKD"),
                    Country("ML", "Mali", "+223", R.raw.flag_ml, "XOF"),
                    Country("MM", "Myanmar", "+95", R.raw.flag_mm, "MMK"),
                    Country("MN", "Mongolia", "+976", R.raw.flag_mn, "MNT"),
                    Country("MO", "Macao", "+853", R.raw.flag_mo, "MOP"),
                    Country("MP", "Northern Mariana Islands", "+1670", R.raw.flag_mp, "USD"),
                    Country("MQ", "Martinique", "+596", R.raw.flag_mq, "EUR"),
                    Country("MR", "Mauritania", "+222", R.raw.flag_mr, "MRO"),
                    Country("MS", "Montserrat", "+1664", R.raw.flag_ms, "XCD"),
                    Country("MT", "Malta", "+356", R.raw.flag_mt, "EUR"),
                    Country("MU", "Mauritius", "+230", R.raw.flag_mu, "MUR"),
                    Country("MV", "Maldives", "+960", R.raw.flag_mv, "MVR"),
                    Country("MW", "Malawi", "+265", R.raw.flag_mw, "MWK"),
                    Country("MX", "Mexico", "+52", R.raw.flag_mx, "MXN"),
                    Country("MY", "Malaysia", "+60", R.raw.flag_my, "MYR"),
                    Country("MZ", "Mozambique", "+258", R.raw.flag_mz, "MZN"),
                    Country("NA", "Namibia", "+264", R.raw.flag_na, "NAD"),
                    Country("NC", "New Caledonia", "+687", R.raw.flag_nc, "XPF"),
                    Country("NE", "Niger", "+227", R.raw.flag_ne, "XOF"),
                    Country("NF", "Norfolk Island", "+672", R.raw.flag_nf, "AUD"),
                    Country("NG", "Nigeria", "+234", R.raw.flag_ng, "NGN"),
                    Country("NI", "Nicaragua", "+505", R.raw.flag_ni, "NIO"),
                    Country("NL", "Netherlands", "+31", R.raw.flag_nl, "EUR"),
                    Country("NO", "Norway", "+47", R.raw.flag_no, "NOK"),
                    Country("NP", "Nepal", "+977", R.raw.flag_np, "NPR"),
                    Country("NR", "Nauru", "+674", R.raw.flag_nr, "AUD"),
                    Country("NU", "Niue", "+683", R.raw.flag_nu, "NZD"),
                    Country("NZ", "New Zealand", "+64", R.raw.flag_nz, "NZD"),
                    Country("OM", "Oman", "+968", R.raw.flag_om, "OMR"),
                    Country("PA", "Panama", "+507", R.raw.flag_pa, "PAB"),
                    Country("PE", "Peru", "+51", R.raw.flag_pe, "PEN"),
                    Country("PF", "French Polynesia", "+689", R.raw.flag_pf, "XPF"),
                    Country("PG", "Papua New Guinea", "+675", R.raw.flag_pg, "PGK"),
                    Country("PH", "Philippines", "+63", R.raw.flag_ph, "PHP"),
                    Country("PK", "Pakistan", "+92", R.raw.flag_pk, "PKR"),
                    Country("PL", "Poland", "+48", R.raw.flag_pl, "PLN"),
                    Country("PM", "Saint Pierre and Miquelon", "+508", R.raw.flag_pm, "EUR"),
                    Country("PN", "Pitcairn", "+872", R.raw.flag_pn, "NZD"),
                    Country("PR", "Puerto Rico", "+1", R.raw.flag_pr, "USD"),
                    Country("PS", "Palestinian Territory, Occupied", "+970", R.raw.flag_ps, "ILS"),
                    Country("PT", "Portugal", "+351", R.raw.flag_pt, "EUR"),
                    Country("PW", "Palau", "+680", R.raw.flag_pw, "USD"),
                    Country("PY", "Paraguay", "+595", R.raw.flag_py, "PYG"),
                    Country("QA", "Qatar", "+974", R.raw.flag_qa, "QAR"),
                    Country("RE", "Reunion", "+262", R.raw.flag_re, "EUR"),
                    Country("RO", "Romania", "+40", R.raw.flag_ro, "RON"),
                    Country("RS", "Serbia", "+381", R.raw.flag_rs, "RSD"),
                    Country("RU", "Russia", "+7", R.raw.flag_ru, "RUB"),
                    Country("RW", "Rwanda", "+250", R.raw.flag_rw, "RWF"),
                    Country("SA", "Saudi Arabia", "+966", R.raw.flag_sa, "SAR"),
                    Country("SB", "Solomon Islands", "+677", R.raw.flag_sb, "SBD"),
                    Country("SC", "Seychelles", "+248", R.raw.flag_sc, "SCR"),
                    Country("SD", "Sudan", "+249", R.raw.flag_sd, "SDG"),
                    Country("SE", "Sweden", "+46", R.raw.flag_se, "SEK"),
                    Country("SG", "Singapore", "+65", R.raw.flag_sg, "SGD"),
                    Country("SH", "Saint Helena, Ascension and Tristan Da Cunha", "+290", R.raw.flag_sh,
                            "SHP"),
                    Country("SI", "Slovenia", "+386", R.raw.flag_si, "EUR"),
                    Country("SJ", "Svalbard and Jan Mayen", "+47", R.raw.flag_sj, "NOK"),
                    Country("SK", "Slovakia", "+421", R.raw.flag_sk, "EUR"),
                    Country("SL", "Sierra Leone", "+232", R.raw.flag_sl, "SLL"),
                    Country("SM", "San Marino", "+378", R.raw.flag_sm, "EUR"),
                    Country("SN", "Senegal", "+221", R.raw.flag_sn, "XOF"),
                    Country("SO", "Somalia", "+252", R.raw.flag_so, "SOS"),
                    Country("SR", "Suriname", "+597", R.raw.flag_sr, "SRD"),
                    Country("SS", "South Sudan", "+211", R.raw.flag_ss, "SSP"),
                    Country("ST", "Sao Tome and Principe", "+239", R.raw.flag_st, "STD"),
                    Country("SV", "El Salvador", "+503", R.raw.flag_sv, "SVC"),
                    Country("SX", "Sint Maarten", "+1721", R.raw.flag_sx, "ANG"),
                    Country("SY", "Syrian Arab Republic", "+963", R.raw.flag_sy, "SYP"),
                    Country("SZ", "Swaziland", "+268", R.raw.flag_sz, "SZL"),
                    Country("TC", "Turks and Caicos Islands", "+1649", R.raw.flag_tc, "USD"),
                    Country("TD", "Chad", "+235", R.raw.flag_td, "XAF"),
                    Country("TF", "French Southern Territories", "+262", R.raw.flag_tf, "EUR"),
                    Country("TG", "Togo", "+228", R.raw.flag_tg, "XOF"),
                    Country("TH", "Thailand", "+66", R.raw.flag_th, "THB"),
                    Country("TJ", "Tajikistan", "+992", R.raw.flag_tj, "TJS"),
                    Country("TK", "Tokelau", "+690", R.raw.flag_tk, "NZD"),
                    Country("TL", "East Timor", "+670", R.raw.flag_tl, "USD"),
                    Country("TM", "Turkmenistan", "+993", R.raw.flag_tm, "TMT"),
                    Country("TN", "Tunisia", "+216", R.raw.flag_tn, "TND"),
                    Country("TO", "Tonga", "+676", R.raw.flag_to, "TOP"),
                    Country("TR", "Turkey", "+90", R.raw.flag_tr, "TRY"),
                    Country("TT", "Trinidad and Tobago", "+1868", R.raw.flag_tt, "TTD"),
                    Country("TV", "Tuvalu", "+688", R.raw.flag_tv, "AUD"),
                    Country("TW", "Taiwan", "+886", R.raw.flag_tw, "TWD"),
                    Country("TZ", "Tanzania, United Republic of", "+255", R.raw.flag_tz, "TZS"),
                    Country("UA", "Ukraine", "+380", R.raw.flag_ua, "UAH"),
                    Country("UG", "Uganda", "+256", R.raw.flag_ug, "UGX"),
                    Country("UM", "U.S. Minor Outlying Islands", "+1", R.raw.flag_um, "USD"),
                    Country("US", "United States", "+1", R.raw.flag_us, "USD"),
                    Country("UY", "Uruguay", "+598", R.raw.flag_uy, "UYU"),
                    Country("UZ", "Uzbekistan", "+998", R.raw.flag_uz, "UZS"),
                    Country("VA", "Holy See (Vatican City State)", "+379", R.raw.flag_va, "EUR"),
                    Country("VC", "Saint Vincent and the Grenadines", "+1784", R.raw.flag_vc, "XCD"),
                    Country("VE", "Venezuela, Bolivarian Republic of", "+58", R.raw.flag_ve, "VEF"),
                    Country("VG", "Virgin Islands, British", "+1284", R.raw.flag_vg, "USD"),
                    Country("VI", "Virgin Islands, U.S.", "+1340", R.raw.flag_vi, "USD"),
                    Country("VN", "Vietnam", "+84", R.raw.flag_vn, "VND"),
                    Country("VU", "Vanuatu", "+678", R.raw.flag_vu, "VUV"),
                    Country("WF", "Wallis and Futuna", "+681", R.raw.flag_wf, "XPF"),
                    Country("WS", "Samoa", "+685", R.raw.flag_ws, "WST"),
                    Country("XK", "Kosovo", "+383", R.raw.flag_xk, "EUR"),
                    Country("YE", "Yemen", "+967", R.raw.flag_ye, "YER"),
                    Country("YT", "Mayotte", "+262", R.raw.flag_yt, "EUR"),
                    Country("ZA", "South Africa", "+27", R.raw.flag_za, "ZAR"),
                    Country("ZM", "Zambia", "+260", R.raw.flag_zm, "ZMW"),
                    Country("ZW", "Zimbabwe", "+263", R.raw.flag_zw, "USD")
            )
        }
    }
}