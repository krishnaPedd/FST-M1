	
import pytest
 
# Create fixture
@pytest.fixture
def num_list():
 
    int_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     
    return int_list
 
def test_sum(num_list):
 
    sum = 0
 
    # Add number in the list
    for n in num_list:
        sum += n
    assert sum == 55