package com.project.pancake.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
	
	private long id;
    private List<PancakeDTO> pancakes = new ArrayList<>();
    private double totalPrice;

    public List<PancakeDTO> getPancakes() {
        return pancakes;
    }

    public void setPancakes(List<PancakeDTO> pancakes) {
        this.pancakes = pancakes;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
