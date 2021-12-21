/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author udesh
 */
public class Item_DTO {
    private static String itemId;
    private static String itmeUnitId;

    public static void setItmeUnitId(String itmeUnitId) {
        Item_DTO.itmeUnitId = itmeUnitId;
    }

    public static String getItmeUnitId() {
        return itmeUnitId;
    }

    public static void setItemId(String itemId) {
        Item_DTO.itemId = itemId;
    }

    public static String getItemId() {
        return itemId;
    }
}
