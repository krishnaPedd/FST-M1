import pytest

def test_addition():
    num1=10
    num2=25
    sum=num1 + num2
    assert sum == 35

def test_subtraction():
    num1=40
    num2=25
    sub=num1 - num2
    assert sub == 15

def test_multiplication():
    num1=4
    num2=25
    mul=num1 * num2
    assert mul == 100

def test_division():
    num1=100
    num2=4
    div=num1 / num2
    assert div == 25

    